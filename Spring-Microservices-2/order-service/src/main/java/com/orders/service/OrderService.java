package com.orders.service;

import com.orders.dto.InventoryResponse;
import com.orders.dto.OrderLineItemDto;
import com.orders.dto.OrderRequest;

import com.orders.model.OrderLineItems;
import com.orders.model.Orders;
import com.orders.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {


    private final OrderRepository orderRepository;
    private final WebClient webClient;
    public void placeOrder(OrderRequest orderRequest)
    {
        Orders order = new Orders();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems>  orderLineItemsList = orderRequest.getOrderLineItemDtoList()
                .stream().map(this::mapToDto).toList();
        order.setOrderLineItemsList(orderLineItemsList);




       List<String> skuCodes= order.getOrderLineItemsList().stream()
                .map(orderLineItems -> orderLineItems.getSkuCode())
                .toList();



        // call inventory service and place
        // the order if product is in stock

        InventoryResponse[] inventoryResponseArray  = webClient.get().uri("http://localhost:8083/api/inventory/",
                        uriBuilder -> uriBuilder.queryParam("sku-code",skuCodes).build())
                .accept(MediaType.ALL)
                .retrieve()
                .bodyToMono(InventoryResponse[].class).block();


        boolean allProductsInStock = Arrays.stream(inventoryResponseArray).allMatch(InventoryResponse::isInStock);
        if(allProductsInStock){
            orderRepository.save(order);

        }else {
            throw new IllegalArgumentException("product not in stock plase try again later...");
        }


    }

    private OrderLineItems mapToDto(OrderLineItemDto orderLineItemDto) {
        OrderLineItems orderLineItems = new OrderLineItems();

        orderLineItems.setPrice(orderLineItemDto.getPrice());
        orderLineItems.setQuantity(orderLineItemDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemDto.getSkuCode());



        return orderLineItems;
    }


}

package com.product.service;

import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest)
    {
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription()).build();
        productRepository.save(product);

        log.info("Product {} is Saved...",product.getName());


    }

    public List<ProductResponse> getAllProducts() {

       List<Product> products= productRepository.findAll();
      return products.stream().map(this:: mapToProductResponse).collect(Collectors.toList());
    }

    private ProductResponse mapToProductResponse(Product product) {
        return  ProductResponse.builder().id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription()).build();

    }
}

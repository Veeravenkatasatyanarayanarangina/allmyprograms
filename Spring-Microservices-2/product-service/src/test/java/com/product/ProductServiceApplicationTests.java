package com.product;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.dto.ProductRequest;
import com.product.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest

class ProductServiceApplicationTests {

	@Test
	void contextLoads(){}
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private ProductRepository productRepository;
//	@Container
//	static
//	MySQLContainer mySQLContainer = new MySQLContainer<>("mysql:5.5");
//
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry)
//	{
//		dynamicPropertyRegistry.add("spring.datasource.url",mySQLContainer::getJdbcUrl);
//	}
//
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//
//		String productRequestString =objectMapper.writeValueAsString(productRequest);
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//					.contentType(MediaType.APPLICATION_JSON)
//					.content(productRequestString))
//				.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//
//
//	}
//
//	public ProductRequest getProductRequest(){
//		 return ProductRequest.builder()
//				.name("samsung j7 prime")
//				.description("my first phone")
//				.price(BigDecimal.valueOf(15000))
//				.build();
//	}


}

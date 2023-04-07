package com.hcl.gl.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerController 
{
   @Bean
   public Docket libraryApi()  
   {
	   return new Docket(DocumentationType.SWAGGER_2)  
			             .apiInfo(apiInfo())  
			             .groupName("SurabiRestaurant-API")
			             .select().apis(RequestHandlerSelectors.basePackage("com.hcl.gl.controller"))
			             .build();
   }
   private ApiInfo apiInfo()
   {
	   return new ApiInfoBuilder().title("SurabiRestaurant API")
			   .description("Surabi API for Restaurant")
			   .termsOfServiceUrl("http://www.google.co.in")
			   .contact(new Contact("SurabiRestaurant API","http://www.data.com","surabirestaurant@mail.com"))
			   .license("Company License")
			   .licenseUrl("http://www.surabirestaurant.com")
			   .version("1.0")
			   .build();
   }
}
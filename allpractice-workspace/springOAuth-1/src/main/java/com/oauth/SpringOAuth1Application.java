package com.oauth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringOAuth1Application {

	public static void main(String[] args) {
		
//		WebClient webClient = WebClient.create();
//		Object[] list = webClient.get().uri("https://jsonplaceholder.typicode.com/users")
//				.accept(MediaType.APPLICATION_JSON)
//				.retrieve()
//				.bodyToMono(Object[].class).block();
//		
//		Map<Integer,Object> maplist = new HashMap<>();
//		int count = 1;
//		
//			for(Object o:list)
//			{
//				maplist.put(count, o);
//				count++;
//			}
//		Iterator<?> it = maplist.entrySet().iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			System.out.println();
//		}
//		
		
		
		
		SpringApplication.run(SpringOAuth1Application.class, args);
	}

}

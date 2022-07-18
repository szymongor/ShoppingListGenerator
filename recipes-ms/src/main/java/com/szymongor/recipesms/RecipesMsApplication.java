package com.szymongor.recipesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RecipesMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipesMsApplication.class, args);
	}

}

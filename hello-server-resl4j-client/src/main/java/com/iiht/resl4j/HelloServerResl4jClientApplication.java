package com.iiht.resl4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloServerResl4jClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServerResl4jClientApplication.class, args);

	}

	
	@Bean
	public RestTemplate newTemplate() {
		return new RestTemplate();
	}
}

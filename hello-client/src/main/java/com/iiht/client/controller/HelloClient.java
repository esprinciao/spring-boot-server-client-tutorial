package com.iiht.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public ResponseEntity<String> connect() {
		String url = "http://localhost:8071/rest/service/message";
		
		/* url = "https://bored-api.appbrewery.com/random"; */
		
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		
		
		/* String response = template.getForObject(url, String.class); */
		
		return response;
	}

}

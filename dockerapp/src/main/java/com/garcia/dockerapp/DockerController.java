package com.garcia.dockerapp;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DockerController {

	@GetMapping("/")
	public String info() {
		log.info("Requesting information from data layer apps...");
		Request requestMsg = new Request();
		requestMsg.setId(1);
		HttpEntity<Request> request = new HttpEntity<>(requestMsg);
		RestTemplate restClient = new RestTemplate();
		ResponseEntity<Response> response = restClient.exchange("http://192.168.99.100:81/sampledata", HttpMethod.POST, request, Response.class);
		return response.getBody().getContent();
	}
	
}

package com.garcia.dockerdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DockerController {

	@Autowired
	private SampleDataService service;
	
	@PostMapping("/sampledata")
	public SampleData sampledata(@RequestBody SampleData request) {
		log.info("Preparing information for app layer apps...");
		return service.getSampleData(request);
	}
	
}

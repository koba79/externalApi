package com.unsplash.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ListCollections {

	
	@RequestMapping("collections/{filter}")
	public String listCollectionsById(@PathVariable("filter") String filter) {

		String uri = "https://api.unsplash.com/collections?filter="+filter;
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    return result; 
	}
	
}

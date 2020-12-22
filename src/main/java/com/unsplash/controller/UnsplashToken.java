package com.unsplash.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UnsplashToken {
	
	
	@RequestMapping("user")
	public String getToken(@RequestParam("client_id") String client_id,@RequestParam("client_secret") String client_secret,
			@RequestParam("redirect_uri") String redirect_uri,@RequestParam("code") String code,@RequestParam("grant_type") String grant_type) {
		String uri = "https://unsplash.com/oauth/token?client_id="+client_id+"&"+"client_secret="+client_secret+"&"+"redirect_uri="+redirect_uri+"&"+"code="+code+"&"+"grant_type="+grant_type;
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    return result; 
	}
	

}

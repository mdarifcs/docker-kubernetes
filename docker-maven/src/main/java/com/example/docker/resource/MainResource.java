package com.example.docker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-maven")
public class MainResource {
	
	@GetMapping("/test")
	public String test() {
		return "successfull version 2";
	}
}

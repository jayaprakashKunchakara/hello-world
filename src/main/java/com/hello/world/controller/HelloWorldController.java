package com.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring Boot";
	}

}

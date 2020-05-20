package com.example.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
public class DevHelloController {

	@GetMapping("/dev")
	public String getDev() {
		return "this is Dev";
	}
	
}

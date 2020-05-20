package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {
	
	@Value("${spring.message}")
	private String message;
	
	@GetMapping("/resp")
	public ResponseEntity<String> getResponse(){
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}

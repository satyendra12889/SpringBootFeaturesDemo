package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.sevice.DataService;
@RestController
public class FirstController {
	
	@Value("${spring.message}")
	private String message;
	
	@Autowired
	private DataService service;
	
	@GetMapping("/resp")
	public ResponseEntity<String> getResponse(){
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("/respdata/{param}")
	public ResponseEntity<List<String>> getResponseData(@PathVariable("param")int param){
		List<String> data = service.fetchData(param);
		if(data!=null) {
			throw new RuntimeException("SOmething went wrong");
		}
		return new ResponseEntity<List<String>>(data, HttpStatus.OK);
	}
	
	@GetMapping("/clearCache")
	@ResponseBody
	@CacheEvict(value="data", allEntries=true)
	public void clearChache(){
	}

}

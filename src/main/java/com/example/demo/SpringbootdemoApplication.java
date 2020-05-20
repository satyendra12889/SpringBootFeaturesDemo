package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootdemoApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringbootdemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		
	}

}

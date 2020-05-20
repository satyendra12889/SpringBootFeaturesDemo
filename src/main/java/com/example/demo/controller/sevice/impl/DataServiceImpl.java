package com.example.demo.controller.sevice.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.controller.sevice.DataService;
@Service
public class DataServiceImpl implements DataService{

	@Cacheable(value = "data")
	public List<String> fetchData(int param1) {
		
		return Arrays.asList("one", "two","three");
	}

}

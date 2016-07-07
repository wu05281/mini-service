package com.riches.service.dubbo.registry.impl;

import org.springframework.stereotype.Service;

import com.riches.service.dubbo.registry.TestRegistryService;

@Service("testRegisService")
public class TestRegistryServiceImpl implements TestRegistryService {  
	public String hello(String name) {    
	    return "hello"+name;  
	}  
}
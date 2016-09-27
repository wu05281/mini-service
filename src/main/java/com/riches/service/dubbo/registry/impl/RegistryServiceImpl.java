package com.riches.service.dubbo.registry.impl;

import org.springframework.stereotype.Service;

import com.riches.service.dubbo.registry.RegistryService;

@Service("regisService")
public class RegistryServiceImpl implements RegistryService {  
	public String hello(String name) {    
	    return "hello"+name;  
	}  
}
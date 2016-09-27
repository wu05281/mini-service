package com.riches.service.dubbo.local;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.riches.service.dubbo.registry.RegistryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class TestRegistryService {
	@Resource
	private RegistryService registryService;
	
	@Test
	public void testHello(){
		String reslut = registryService.hello(" world!");
//		assertTrue(reslut.equals("hello world!"));
	}
}

package com.riches.service.dubbo.registry;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в��� 
@ContextConfiguration  
({"classpath:dubbo-consumer.xml"}) //���������ļ�  
public class TestRegistry{
	
	@Resource
	private TestRegistryService testRegistryService;
	
	@Test
	public void testDubbo(){
		testRegistryService.hello(" world!");
	}

}

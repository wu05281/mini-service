package com.riches.service.dubbo.registry;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试 
@ContextConfiguration  
({"classpath:dubbo-consumer.xml"}) //加载配置文件  
public class TestRegistry{
	
	@Resource
	private TestRegistryService testRegistryService;
	
	@Test
	public void testDubbo(){
		testRegistryService.hello(" world!");
	}

}

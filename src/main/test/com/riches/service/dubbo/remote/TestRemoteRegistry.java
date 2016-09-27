package com.riches.service.dubbo.remote;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.riches.service.dubbo.registry.RegistryService;

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в��� 
@ContextConfiguration  
({"classpath:dubbo-consumer.xml"}) //���������ļ�  
public class TestRemoteRegistry{
	
	@Resource
	private RegistryService registryService;
	
	@Test
	public void testHello(){
		for (int i =0;i<100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			registryService.hello(" world!");
		}
	}

}

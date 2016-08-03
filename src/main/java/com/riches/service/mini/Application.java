package com.riches.service.mini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@EnableScheduling//��������
@EnableAutoConfiguration
@ImportResource({"classpath:dubboContext.xml"}) //����dubbo��bean��xml�ļ�   
public class Application implements EmbeddedServletContainerCustomizer {  

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	@Qualifier("testRegistryService")
//	private TestRegistryService testRegistryService;

	@RequestMapping("/")
	String home() {

		String sql = "select count(ua_ub_id_n) from User_Address where isactive = 1 and ua_ub_id_n = 151130101110000281";
		int i = jdbcTemplate.queryForObject(sql, Integer.class);
//		System.out.println(testRegistryService.hello("ok"));
		return "test query" + i;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	//����Ĭ�������˿ں�
	public void customize(ConfigurableEmbeddedServletContainer container) {
		  container.setPort(1001);  
	}
}

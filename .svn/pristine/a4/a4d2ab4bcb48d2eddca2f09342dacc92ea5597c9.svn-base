package com.xzl.bat;

import com.xzl.boilerplate.common.utils.RestTemplateUtil;
//ps: tk.mybatis而非org.mybatis !!!
//import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.xzl")
//@MapperScan("com.xzl.authserver.domain.mapper")
public class BatApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplateUtil restTemplateUtil() {
		RestTemplateUtil restTemplateUtil = new RestTemplateUtil(new RestTemplate());
		return restTemplateUtil;
	}

}

package com.richy.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

private final static Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		logger.info("ConsumerApplication Run Successfully...");
	}
}

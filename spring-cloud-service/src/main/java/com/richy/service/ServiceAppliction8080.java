package com.richy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @descrp：端口为8080的服务提供者
 * @author：FyRichy
 * @time：2019年2月13日下午5:15:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAppliction8080 {

private final static Logger logger = LoggerFactory.getLogger(ServiceAppliction8080.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAppliction8080.class, args);
		logger.info("ServiceAppliction8080 Run Successfully...");
	}
}

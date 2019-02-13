package com.richy.eureka.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @descrp：Eureka服务启动类
 * @author：FyRichy
 * @time：2019年2月13日下午4:52:43
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication10086 {

	private final static Logger logger = LoggerFactory.getLogger(EurekaServerApplication10086.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication10086.class, args);
		logger.info("EurekaServerApplication10086 Run Successfully...");
	}
}

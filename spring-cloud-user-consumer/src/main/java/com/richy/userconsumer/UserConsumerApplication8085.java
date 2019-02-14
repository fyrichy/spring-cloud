package com.richy.userconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @descrp：UserConsumer服务消费启动类
 * @author：FyRichy
 * @time：2019年2月14日下午3:40:50
 */
@SpringBootApplication
public class UserConsumerApplication8085 {

private final static Logger logger = LoggerFactory.getLogger(UserConsumerApplication8085.class);
	
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerApplication8085.class, args);
		logger.info("UserConsumerApplication8085 Run Sucessfully...");
	}
}

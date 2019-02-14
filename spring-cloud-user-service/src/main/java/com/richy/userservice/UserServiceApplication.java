package com.richy.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @descrp：UserService启动类
 * @author：FyRichy
 * @time：2019年2月14日下午2:08:49
 */
@SpringBootApplication
public class UserServiceApplication {

	private final static Logger logger = LoggerFactory.getLogger(UserServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		logger.info("UserServiceApplication Run Sucessfully...");
	}
}

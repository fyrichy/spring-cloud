package com.richy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @descrp：SpringBoot启动类
 * @author：FyRichy
 * @time：2019年2月13日上午10:36:53
 */
@SpringBootApplication
public class ApplicationStartRun {

	private final static Logger logger = LoggerFactory.getLogger(ApplicationStartRun.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartRun.class, args);
		logger.info("Spring-Cloud-Boot Run Success");
	}
}

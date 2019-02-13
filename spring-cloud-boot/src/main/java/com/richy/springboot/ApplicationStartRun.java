package com.richy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @descrp：项目启动类
 * @author：FyRichy
 * @time：2019年2月13日上午9:14:24
 */
@SpringBootApplication
public class ApplicationStartRun {

	//日志类
	private final static Logger logger = LoggerFactory.getLogger(ApplicationStartRun.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartRun.class, args);
		logger.info("The Example Application Run Success....");
	}
}

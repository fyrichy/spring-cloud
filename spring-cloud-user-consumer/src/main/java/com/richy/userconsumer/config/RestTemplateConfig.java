package com.richy.userconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @descrp：RestTemplate配置类
 * @author：FyRichy
 * @time：2019年2月14日下午3:43:04
 */
@Configuration
public class RestTemplateConfig {

	//获取RestTemplate
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

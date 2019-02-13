package com.richy.springboot.config.statics;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @descrp：静态资源访问转换配置类
 * @author：FyRichy
 * @time：2019年2月13日下午2:41:28
 */
//@Configuration
public class StaticResourceDispatcherConfig extends WebMvcConfigurerAdapter{

	/**
	 * descrp：自定义静态资源路径,
	 * @author：FyRichy
	 * @time：2019年2月13日下午2:45:32
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/cloud/**").addResourceLocations("classpath:/static/");
	}
}

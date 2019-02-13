package com.richy.springboot.config.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @descrp：jdbc配置信息
 * @author：FyRichy
 * @time：2019年2月13日上午10:53:41
 */
//声明一个类作为配置类，代替xml文件
@Configuration
//指定外部属性文件
//@PropertySource("classpath:jdbc/jdbc.properties")
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

	/*@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.driverClassName}")
	String driverClassName;
	@Value("${jdbc.username}")
	String username;
	@Value("${jdbc.password}")
	String password;*/
	
	/**
	 * @descrp：配置数据库连接池
	 * @author：FyRichy
	 * @time：2019年2月13日上午10:59:05
	 * @return
	 */
	@Bean
	public DataSource dataSource(JdbcProperties jdbc) {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(jdbc.getUrl());
		dataSource.setDriverClassName(jdbc.getDriverClassName());
		dataSource.setUsername(jdbc.getUsername());
		dataSource.setPassword(jdbc.getPassword());
		System.out.println("mysql数据库连接url："+jdbc.getUrl());
		return dataSource;
	}
}

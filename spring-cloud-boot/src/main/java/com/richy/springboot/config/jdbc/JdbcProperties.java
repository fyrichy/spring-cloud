package com.richy.springboot.config.jdbc;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @descrp：使用注解@ConfigurationProperties(prefix="jdbc")
 * 	表示在配置文件application.properties中读取前缀为jdbc的配置
 * @author：FyRichy
 * @time：2019年2月13日上午11:06:03
 */
@ConfigurationProperties(prefix="jdbc")
public class JdbcProperties {

	private String url;
	private String driverClassName;
	private String username;
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

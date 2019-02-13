package com.richy.springboot.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descrp：HomeController
 * @author：FyRichy
 * @time：2019年2月13日上午10:35:15
 */
@RestController
public class HomeController {

	@Autowired
	private DataSource dataSoruce;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Spring-Cloud-Boot--->"+dataSoruce;
	}
}

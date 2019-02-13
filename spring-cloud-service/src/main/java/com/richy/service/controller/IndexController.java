package com.richy.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @descrp：HelloController
 * @author：FyRichy
 * @time：2019年2月13日下午5:20:23
 */
@RestController
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "This Is Eureka Service Provider";
	}
	
}

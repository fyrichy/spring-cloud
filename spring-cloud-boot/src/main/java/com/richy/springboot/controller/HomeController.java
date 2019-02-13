package com.richy.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descrp：定义HomeController
 * @author：FyRichy
 * @time：2019年2月13日上午9:16:58
 */
@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "The Example SpringBoot";
	}
}

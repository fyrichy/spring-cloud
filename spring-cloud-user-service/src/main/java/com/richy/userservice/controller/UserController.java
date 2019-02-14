package com.richy.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richy.userservice.pojo.User;
import com.richy.userservice.service.UserService;

/**
 * @descrp：UserController
 * @author：FyRichy
 * @time：2019年2月14日下午3:14:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * @descrp：根据ID查询
	 * @author：FyRichy
	 * @time：2019年2月14日下午3:17:33
	 * @return
	 */
	@RequestMapping("/{id}")
	public User queryById(@PathVariable Integer id) {
		return userService.getById(id);
	}
}

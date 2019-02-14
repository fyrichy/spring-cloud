package com.richy.userconsumer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.richy.userconsumer.model.User;


/**
 * @descrp：定义UserConsumerController
 * @author：FyRichy
 * @time：2019年2月14日下午3:44:53
 */
@RestController
@RequestMapping("/user")
public class UserConsumerController {
	
	private final static String USER_SERVICE_URL="http://localhost:8084/user/";

	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * @descrp：根据ID获取用户
	 * @author：FyRichy
	 * @time：2019年2月14日下午3:47:14
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}")
	public User findUserById(@PathVariable Integer id) {
		User user = (User)restTemplate.getForObject(USER_SERVICE_URL+id, User.class);
		System.out.println("查询到对象User："+user);
		return user;
	}
	
	/**
	 * @descrp：查询所有
	 * @author：FyRichy
	 * @time：2019年2月14日下午4:03:59
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<User> findAll() {
		User[] users =  restTemplate.getForObject(USER_SERVICE_URL+"findAll",User[].class);
		List<User> list = Arrays.asList(users);
		return list;
	}
}

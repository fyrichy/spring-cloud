package com.richy.userservice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.richy.userservice.pojo.User;
import com.richy.userservice.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
@WebAppConfiguration
public class BaseJnuit {

	@Autowired
	UserService userService;
	
	@Test
	public void testUserService() {
		List<User> userList = userService.findAll();
		if(null != userList && userList.size() > 0) {
			for(User user:userList) {
				System.out.println(user);
			}
		}
	}
	
	@Test
	public void testInserUser() {
		User user = new User();
		user.setName("比尔·盖茨");
		user.setUsername("BillGates");
		user.setPassword("123456");
		user.setAge(50);
		user.setSex("男");
		userService.inserUser(user);
	}
	
	@Test
	public void testGetUserById() {
		System.out.println(userService.getById(4));
	}
}

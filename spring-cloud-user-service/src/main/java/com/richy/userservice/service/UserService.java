package com.richy.userservice.service;

import java.util.List;

import com.richy.userservice.pojo.User;

public interface UserService {

	List<User> findAll();
	
	void inserUser(User user);

	User getById(Integer id);
}

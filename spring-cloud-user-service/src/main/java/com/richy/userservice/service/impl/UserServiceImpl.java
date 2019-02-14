package com.richy.userservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richy.userservice.mapper.UserMapper;
import com.richy.userservice.pojo.User;
import com.richy.userservice.service.UserService;

/**
 * @descrp：定义UserService
 * @author：FyRichy
 * @time：2019年2月14日下午3:01:48
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	/**
	 * @descrp：查询所有用户
	 * @author：FyRichy
	 * @time：2019年2月14日下午3:01:56
	 * @return
	 */
	public List<User> findAll() {
		return userMapper.selectAll();
	}

	/**
	 * @descrp：在User表插入数据
	 * @author：FyRichy
	 * @time：2019年2月14日下午3:02:05
	 * @param user
	 */
	public void inserUser(User user) {
		userMapper.insert(user);
	}

	/**
	 * @descrp：根据ID查询用户
	 * @author：FyRichy
	 * @time：2019年2月14日下午3:02:16
	 * @param id
	 * @return
	 */
	public User getById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	
}

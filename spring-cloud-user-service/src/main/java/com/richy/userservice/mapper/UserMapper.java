package com.richy.userservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.richy.userservice.pojo.User;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{

}

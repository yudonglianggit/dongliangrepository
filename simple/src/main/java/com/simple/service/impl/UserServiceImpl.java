package com.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simple.dao.UserMapper;
import com.simple.model.User;
import com.simple.service.IUserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper userMapper;
	
	@Transactional(readOnly = true)
	@Override
	public int isHaveByAccount(String account) {
		return userMapper.isHaveByAccount(account);
	}
	
	@Transactional(readOnly = true)
	@Override
	public User getLoginUser(String account, String password) {
		return userMapper.getLoginUser(account, password);
	}

}

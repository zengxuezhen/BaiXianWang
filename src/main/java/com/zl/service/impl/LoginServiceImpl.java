package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UserDao;
import com.zl.pojo.User;
import com.zl.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserDao ud;
	@Override
	public User login(User user) {
		return ud.login(user);
		
	}
	
}

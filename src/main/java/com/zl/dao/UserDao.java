package com.zl.dao;

import com.zl.pojo.User;

public interface UserDao {
	User login(User user); 
	int register(User user);
}

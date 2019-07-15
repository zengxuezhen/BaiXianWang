package com.zl.dao;

import com.zl.pojo.BankAccount;
import com.zl.pojo.User;

public interface UserDao {
	/*
	 * 登录
	 * */
	User login(User user); 
	/*
	 * 注册
	 * */
	int register(User user);
	/*
	 * 查询用户所有信息
	 * */
	User queryUserByID(Integer id);
	/*
	 * 更新用户所有信息
	 * */
	int updateUser(User user);
	/*
	 * 添加银行信息
	 * */
	int addAccount(BankAccount bankAccount);
}

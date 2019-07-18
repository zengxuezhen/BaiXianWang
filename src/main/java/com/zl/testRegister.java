package com.zl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zl.pojo.User;
import com.zl.service.UserService;

public class testRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		ApplicationContext app= new ClassPathXmlApplicationContext("classpath:springIOC.xml");
		UserService us= (UserService)app.getBean("userServiceImpl");
		user.setUserName("aaa");
		user.setPassword("123");
		us.register(user);
	}

}

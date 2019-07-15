package com.zl.controller;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.User;
import com.zl.service.UserService;
import com.zl.util.MD5Util;
@Controller
public class UserController {
	//get loginService instance from IOC
	@Autowired
	private UserService us;
	
	@RequestMapping("/register")
	/*
	 * 注册
	 * */
	public ModelAndView register(User user) {
		ModelAndView mv=new ModelAndView();
		us.register(user);
		mv.setViewName("login");
		return mv;
		
	}
	
	@RequestMapping("/login")
	/*
	 * 登录
	 * */
	public ModelAndView login(User user,HttpServletRequest req,HttpServletResponse resp) throws UnsupportedEncodingException {
		ModelAndView mv=new ModelAndView();
		user.setPassword(MD5Util.getMD5(user.getPassword()));
		user=us.login(user);
		System.out.println(user);
		if(user!=null) {
			req.getSession().setAttribute("user", user);
			mv.setViewName("redirect:/home.html");	
		}else {
			req.setAttribute("error", "用户名密码错误！！！");
			mv.setViewName("login");
		}
		return mv;
	}
}

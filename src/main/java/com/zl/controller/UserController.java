package com.zl.controller;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.User;
import com.zl.service.UserService;
import com.zl.util.MD5Util;
@Controller
@RequestMapping("/user")
public class UserController {
	//get loginService instance from IOC
	@Autowired
	private UserService us;
	
	@RequestMapping("/register")
	/*
	 * 注册
	 * */
	public ModelAndView register(User user,HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		req.getSession().setAttribute("user", user);
		user.setPassword(MD5Util.getMD5(user.getPassword()));
		us.register(user);
		mv.setViewName("redirect:../registerSuccess.html");
		return mv;
		
	}
	@RequestMapping("/getUser")
	/*
	 * session中取出user
	 * */
	@ResponseBody
	public User getUser(HttpServletRequest req) {
		User user=(User) req.getSession().getAttribute("user");
		
		return user;
		
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
			mv.setViewName("redirect:../resource.html");	
		}else {
			req.setAttribute("error", "用户名密码错误！！！");
			mv.setViewName("redirect:../login");
		}
		return mv;
	}
}

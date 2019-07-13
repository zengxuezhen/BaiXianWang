/*package com.zl.controller;




import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.User;
import com.zl.service.LoginService;
import com.zl.util.MD5Util;
@Controller
public class UserController {
	//get loginService instance from IOC
	@Autowired
	private LoginService ls;
	
	@RequestMapping("/login")
	public ModelAndView login(User user,HttpServletRequest req,HttpServletResponse resp) throws UnsupportedEncodingException {
		ModelAndView mv=new ModelAndView();
		String ison=(String) req.getParameter("ison");
		System.out.println(user);
		System.out.println(ls);
		user.setPwd(MD5Util.getMD5(user.getPwd()));
		user=ls.login(user);
		System.out.println(user);
		if(user!=null) {
			req.getSession().setAttribute("user", user);
			if("yes".equals(ison)){
  				//用户需要保存
 					//创建cookie对象
 					Cookie cName=new Cookie("name",URLEncoder.encode(user.getName(), "utf-8"));
 					Cookie cPwd=new Cookie("password",user.getPwd());
 					//设置cookie路径
 					cName.setPath("/BookManagerSystem");
 					cPwd.setPath("/BookManagerSystem");
 					//设置cookie的有效时间
 					cName.setMaxAge(24*60*60*100);
 					cPwd.setMaxAge(24*60*60*100);
 					//通过respon对象把cookie发送给客户端
 					resp.addCookie(cName);
 					resp.addCookie(cPwd);
  				}
			mv.setViewName("redirect:/book");	
		}else {
			req.setAttribute("error", "用户名密码错误！！！");
			mv.setViewName("login");
		}
		return mv;
	}
}*/

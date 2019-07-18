package com.zl.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.AuthorizedOperator;
import com.zl.pojo.CompanyInfo;
import com.zl.pojo.SelfEmployedIdentify;
import com.zl.pojo.User;
import com.zl.service.UpgradeCompanyPurchaseService;
import com.zl.service.UpgradeSelfPurchaseService;

@Controller
@ResponseBody
public class UpgradeMemberController {
	
	@Autowired
	private UpgradeSelfPurchaseService us;
	private SelfEmployedIdentify sei;
	private UpgradeCompanyPurchaseService  ucs;
	private CompanyInfo ci;
	/**
	 * 个人升级回显
	 * */
	@RequestMapping(value="/upgradeSelf")
	public SelfEmployedIdentify UpgradeSelfPurchase(HttpServletRequest req) {
		HttpSession session = req.getSession();
		User user =  (User) session.getAttribute("user");
		System.out.println("到达controller层");
		sei = us.selectSelf(user.getId());
		return sei;
		
	}
	/**
	 * 个人升级添加
	 * */
	@RequestMapping(value="/addSelf")
	public void addSelf(SelfEmployedIdentify sei,HttpServletRequest req) {
		
		sei.setSubmissionDate(new Date());
		User user =  (User)req.getSession().getAttribute("user");
		sei.setUserId(user.getId());
		us.addSelf(sei);
	}
	
	/**
	 * 企业升级回显
	 * */
	@RequestMapping(value="/upgradeCompany")
	public CompanyInfo UpgradeCompanyPurchase(HttpServletRequest req) {
		System.out.println("daoda ```````````````````````````````````````````");
		HttpSession session = req.getSession();
		User user =  (User) session.getAttribute("user");
		ci = ucs.selectCompany(user.getId());
		return ci;
		
	}
	
	/**
	 * 企业升级添加
	 * */
	@RequestMapping(value="/addCompany")
	public void addCompany(CompanyInfo sei,HttpServletRequest req) {
		sei.setSubmissionDate(new Date());
		User user =  (User)req.getSession().getAttribute("user");
		sei.setUserId(user.getId());
		ucs.addCompany(sei);
	}
	
	/**
	 * 授权信息回显
	 * */
	@RequestMapping(value="/selectAuthorized")
	public AuthorizedOperator selectAuthorized(HttpServletRequest req) {
		User user =  (User)req.getSession().getAttribute("user");
		if(user!=null) {
			int id = user.getId();
		}
		
		
		int id = user.getId();
		
		return ucs.selectAuthor(id);
		
	}
}

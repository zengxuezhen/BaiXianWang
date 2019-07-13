package com.zl.service;

import com.zl.pojo.AuthorizedOperator;
import com.zl.pojo.CompanyInfo;


public interface UpgradeCompanyPurchaseService {
	/**
	 * 从企业表里查询信息,用于回显
	 * */
	public CompanyInfo selectCompany(int id);
	/**
	 * 升级企业信息,保存保存数据库
	 * */
	public void addCompany(CompanyInfo company);
	/**
	 * 查询企业表的同时,查询授权表
	 * */
	public AuthorizedOperator selectAuthor(int id);
}

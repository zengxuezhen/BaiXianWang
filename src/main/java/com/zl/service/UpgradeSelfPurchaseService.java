package com.zl.service;

import com.zl.pojo.SelfEmployedIdentify;

public interface UpgradeSelfPurchaseService {
	/**
	 * 从个人表里查询信息,用于回显
	 * */
	public SelfEmployedIdentify selectSelf(int id);
	/**
	 * 升级个人信息,保存保存数据库
	 * */
	public void addSelf(SelfEmployedIdentify self);
}

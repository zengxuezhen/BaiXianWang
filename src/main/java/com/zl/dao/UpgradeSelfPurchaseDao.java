package com.zl.dao;

import org.springframework.stereotype.Repository;

import com.zl.pojo.SelfEmployedIdentify;
@Repository
public interface UpgradeSelfPurchaseDao {
	/**
	 * 从个人表里查询信息,用于回显
	 * */
	public SelfEmployedIdentify selectSelf(int id);
	/**
	 * 升级个人信息,保存保存数据库
	 * */
	public void addSelf(SelfEmployedIdentify self);
}

package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UpgradeSelfPurchaseDao;
import com.zl.pojo.SelfEmployedIdentify;
import com.zl.service.UpgradeSelfPurchaseService;
@Service
public class UpgradeSelfPurchaseServiceImpl implements UpgradeSelfPurchaseService {
	
	@Autowired
	private UpgradeSelfPurchaseDao usd;
	@Override
	public SelfEmployedIdentify selectSelf(int id) {
		
		return usd.selectSelf(id);
	}

	@Override
	public void addSelf(SelfEmployedIdentify self) {
		usd.addSelf(self);

	}

}

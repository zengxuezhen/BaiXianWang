package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UpgradeCompanyPurchaseDao;
import com.zl.pojo.AuthorizedOperator;
import com.zl.pojo.CompanyInfo;
import com.zl.service.UpgradeCompanyPurchaseService;
@Service
public class UpgradeCompanyPurchaseServiceImpl implements UpgradeCompanyPurchaseService {
	@Autowired
	private UpgradeCompanyPurchaseDao ucd;
	
	@Override
	public CompanyInfo selectCompany(int id) {
		
		return ucd.selectCompany(id);
	}

	@Override
	public void addCompany(CompanyInfo company) {
		ucd.addCompany(company);

	}

	@Override
	public AuthorizedOperator selectAuthor(int id) {
		
		return ucd.selectAuthor(id);
	}

}

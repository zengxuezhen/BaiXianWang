package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.AddressDao;
import com.zl.pojo.City;
import com.zl.pojo.District;
import com.zl.pojo.Province;
import com.zl.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao ad;

	@Override
	public List<Province> selectProvince() {
		
		return ad.selectProvince();
	}

	@Override
	public List<City> selectCity(int id) {
		
		return ad.selectCity(id);
	}

	@Override
	public List<District> selectDistrict(int id) {
		
		return ad.selectDistrict(id);
	}

}

package com.zl.service;

import java.util.List;

import com.zl.pojo.City;
import com.zl.pojo.District;
import com.zl.pojo.Province;

public interface AddressService {
	/**
	 * 查询所有的省份
	 * */
	public List<Province> selectProvince();
	/**
	 * 查询所有的城市,通过省份ID
	 * */
	public List<City> selectCity(int id);
	/**
	 * 查询所有的区域,通过市的ID
	 * */
	public List<District> selectDistrict(int id);
}

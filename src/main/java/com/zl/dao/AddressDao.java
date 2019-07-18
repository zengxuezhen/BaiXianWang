package com.zl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zl.pojo.City;
import com.zl.pojo.District;
import com.zl.pojo.Province;

@Repository
public interface AddressDao {
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

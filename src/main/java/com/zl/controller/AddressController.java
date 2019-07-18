package com.zl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.City;
import com.zl.pojo.District;
import com.zl.pojo.Province;
import com.zl.service.AddressService;

@Controller
@ResponseBody
public class AddressController {
	
	@Autowired
	private AddressService as;
	
	@RequestMapping(value="/province")
	public List<Province> selectProvince(){
	
		return as.selectProvince();
	}
	@RequestMapping(value="/city")
	public List<City> selectCity(int id){
		
		return as.selectCity(id);
	}
	@RequestMapping(value="/district")
	public List<District> selectDistrict(int id){
		return as.selectDistrict(id);
	}
}

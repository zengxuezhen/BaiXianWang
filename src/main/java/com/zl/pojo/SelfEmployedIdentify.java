package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * 个人认证信息表
 * */
@Component
@Scope("prototype")
public class SelfEmployedIdentify {
	private Integer id;         //主键ID，自增
	private String identifyNo;    //认证表No
	private String realName;      //真实姓名
	private String idNo;    //身份证号码
	private String idPhoto;      //身份证照片（存照片地址）
	private Integer provinceId;       //省ID，外键，连接省表
	private Integer cityId;     //市ID，外键，连接市表
	private Integer districtId;      //区ID，外键，连接区表
	private String mobileNo;     //手机号码
	private String email;       //电子邮箱
	private String phoneNo;      //单位座机
	@DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
	private Date submissionDate;      //上传日期
	private Integer state ;        //状态  0未通过 1待审核 2通过
	private Integer userId;      //用户id 外键连接User表
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentifyNo() {
		return identifyNo;
	}
	public void setIdentifyNo(String identifyNo) {
		this.identifyNo = identifyNo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getIdPhoto() {
		return idPhoto;
	}
	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

}

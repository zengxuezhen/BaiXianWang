package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
	private Integer id;//用户表ID
	private Integer userNo;//用户编号
	private String userName;//用户名
	private String password;//密码
	private String phoneNo;//手机号
	private String nickName;//昵称
	private String avatar;//头像地址
	private String email;//email地址
	private String region;//地区
	private Integer provinceId;//省ID
	private Integer cityId;//市ID
	private Integer districtId;//区ID
	private String role;//角色，用来标识用户，普通用户0，采购1，供应2
	private String companyOrSelfEmployed;//用来表示用户是个人还是企业，1个人2企业
	@DateTimeFormat(pattern="yyyy-MM-dd  HH:mm:ss")
	private Date registerDate;//注册日期时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getCompanyOrSelfEmployed() {
		return companyOrSelfEmployed;
	}
	public void setCompanyOrSelfEmployed(String companyOrSelfEmployed) {
		this.companyOrSelfEmployed = companyOrSelfEmployed;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userNo=" + userNo + ", userName=" + userName + ", password=" + password
				+ ", phoneNo=" + phoneNo + ", nickName=" + nickName + ", avatar=" + avatar + ", email=" + email
				+ ", region=" + region + ", provinceId=" + provinceId + ", cityId=" + cityId + ", districtId="
				+ districtId + ", role=" + role + ", companyOrSelvEmployed=" + companyOrSelfEmployed + ", registerDate="
				+ registerDate + "]";
	}
	
}

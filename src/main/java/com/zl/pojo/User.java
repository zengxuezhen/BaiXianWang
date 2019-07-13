package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
	private Integer id;
	private Integer userNo;
	private String userName;
	private String password;
	private String phoneNo;
	private String nickName;
	private String avatar;
	private String email;
	private String region;
	private Integer provinceId;
	private Integer cityId;
	private Integer districtId;
	private String role;
	private String companyOrSelfEmployed;
	@DateTimeFormat(pattern="yyyy-MM-dd  HH:mm:ss")
	private Date registerDate;
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

package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
/*
 * 企业商户认证信息
 * */
public class Company_Info {
	private Integer id;//主键ID，自增
	private Integer userId;//用户id 外键和User表
	private String companyNumber;//企业编号
	private String companyName;//公司名称
	private Integer provinceId;//省ID，外键，连接省表
	private Integer cityId;//市ID，外键，连接市表
	private Integer districtId;//区ID，外键，连接区表
	private String organizationNumber;//组织机构代码
	private String businessLicense;//营业执照
	private String taxRegistration;//税务登记证
	private String officePhoto;//办公场所图片
	private String foodCirculation;//食品流通许可证
	private String otherCertificatesOne;//其他证件1
	private String otherCertificatesTwo;//其他证件2
	private String otherCertificatesThird;//其他证件3
	private String otherCertificatesFour;//其他证件4
	private String companyOwner;//企业法人姓名
	private Integer state;//状态 0未通过 1待审核 2通过
	@DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
	private Date submissionDate;//上传日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getOrganizationNumber() {
		return organizationNumber;
	}
	public void setOrganizationNumber(String organizationNumber) {
		this.organizationNumber = organizationNumber;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getTaxRegistration() {
		return taxRegistration;
	}
	public void setTaxRegistration(String taxRegistration) {
		this.taxRegistration = taxRegistration;
	}
	public String getOfficePhoto() {
		return officePhoto;
	}
	public void setOfficePhoto(String officePhoto) {
		this.officePhoto = officePhoto;
	}
	public String getFoodCirculation() {
		return foodCirculation;
	}
	public void setFoodCirculation(String foodCirculation) {
		this.foodCirculation = foodCirculation;
	}
	public String getOtherCertificatesOne() {
		return otherCertificatesOne;
	}
	public void setOtherCertificatesOne(String otherCertificatesOne) {
		this.otherCertificatesOne = otherCertificatesOne;
	}
	public String getOtherCertificatesTwo() {
		return otherCertificatesTwo;
	}
	public void setOtherCertificatesTwo(String otherCertificatesTwo) {
		this.otherCertificatesTwo = otherCertificatesTwo;
	}
	public String getOtherCertificatesThird() {
		return otherCertificatesThird;
	}
	public void setOtherCertificatesThird(String otherCertificatesThird) {
		this.otherCertificatesThird = otherCertificatesThird;
	}
	public String getOtherCertificatesFour() {
		return otherCertificatesFour;
	}
	public void setOtherCertificatesFour(String otherCertificatesFour) {
		this.otherCertificatesFour = otherCertificatesFour;
	}
	public String getCompanyOwner() {
		return companyOwner;
	}
	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

}

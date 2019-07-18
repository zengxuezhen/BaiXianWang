package com.zl.pojo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PurchaseOrder {
//主键ID
 private Integer id;
 //采购单编号
 private String purchaseOrderNo;
 //外键，用来连接用户表主键ID
 private Integer userId;
 //采购单名称
 private String purchaseOrderName;
 //采购物品名
 private String productName;
 //采购物品产地
 private String origin;
 //采购物品规格
 private String specification;
 //采购物品级别
 private String level;
 //采购物品仓库地址
 private String warehouse;
 //0期货，1现货
 private String futureSpot;
 //采购物品价格，保留小数点后两位
 private BigDecimal price;
 //采购单说明
 private String purchaseDescription;
 //付款方式
 private String paymentMethod;
 //发票类型
 private String invoiceType;
 //省ID，外键，连接省表
 private Integer provinceId;
 //市ID，外键，连接市表
 private Integer cityId;
 //区ID，外键，连接区表
 private Integer districtId;
 
 //采购截止日期
@DateTimeFormat(pattern="yyyy-MM-dd")
 private Date deadline;
//联系人姓名
 private String contact;
 //联系人手机号
 private String phone;
 //采购单状态，0123标识待审核，通过审核，审核不通过，已关闭
 private Integer state;
 //采购单上传日期
@DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
 private Date submissionDate;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPurchaseOrderNo() {
	return purchaseOrderNo;
}
public void setPurchaseOrderNo(String purchaseOrderNo) {
	this.purchaseOrderNo = purchaseOrderNo;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getPurchaseOrderName() {
	return purchaseOrderName;
}
public void setPurchaseOrderName(String purchaseOrderName) {
	this.purchaseOrderName = purchaseOrderName;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getWarehouse() {
	return warehouse;
}
public void setWarehouse(String warehouse) {
	this.warehouse = warehouse;
}
public String getFutureSpot() {
	return futureSpot;
}
public void setFutureSpot(String futureSpot) {
	this.futureSpot = futureSpot;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
public String getPurchaseDescription() {
	return purchaseDescription;
}
public void setPurchaseDescription(String purchaseDescription) {
	this.purchaseDescription = purchaseDescription;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
public String getInvoiceType() {
	return invoiceType;
}
public void setInvoiceType(String invoiceType) {
	this.invoiceType = invoiceType;
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
public Date getDeadline() {
	return deadline;
}
public void setDeadline(Date deadline) {
	this.deadline = deadline;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
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
@Override
public String toString() {
	return "PurchaseOrder [id=" + id + ", purchaseOrderNo=" + purchaseOrderNo + ", userId=" + userId
			+ ", purchaseOrderName=" + purchaseOrderName + ", productName=" + productName + ", origin=" + origin
			+ ", specification=" + specification + ", level=" + level + ", warehouse=" + warehouse + ", futureSpot="
			+ futureSpot + ", price=" + price + ", purchaseDescription=" + purchaseDescription + ", paymentMethod="
			+ paymentMethod + ", invoiceType=" + invoiceType + ", provinceId=" + provinceId + ", cityId=" + cityId
			+ ", districtId=" + districtId + ", deadline=" + deadline + ", contact=" + contact + ", phone=" + phone
			+ ", state=" + state + ", submissionDate=" + submissionDate + "]";
}
 
}

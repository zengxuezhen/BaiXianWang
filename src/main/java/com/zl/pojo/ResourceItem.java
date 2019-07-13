package com.zl.pojo;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ResourceItem {
	/**
	 *  主键ID，自增
		资源物品单编号
		资源物品三级分类表ID
		资源物品名称
		资源物品产地
		资源物品规格型号
		资源物品数量(单位，千克)
		资源物品单价
		资源物品货币
		资源物品仓库
		0期货，1现货
		资源物品备注
		资源单ID 外键，连接资源单

	 */
private	int id;
private	int productNo;
private	int thirdClassId;
private	int productName;
private	String origin;
private	String specifications;
private	String quantity;
private	double price;
private	String currency;
private	String warehouse;
private	String futureSpot;
private	String description;
private	int resourceId;
/**
 * 查询ResourceItem的时候可以让mybatis级联给我查询他对应的所有的ClassThree
 */
private List<ClassThree> ClassThree;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getProductNo() {
	return productNo;
}
public void setProductNo(int productNo) {
	this.productNo = productNo;
}
public int getThirdClassId() {
	return thirdClassId;
}
public void setThirdClassId(int thirdClassId) {
	this.thirdClassId = thirdClassId;
}
public int getProductName() {
	return productName;
}
public void setProductName(int productName) {
	this.productName = productName;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getSpecifications() {
	return specifications;
}
public void setSpecifications(String specifications) {
	this.specifications = specifications;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getResourceId() {
	return resourceId;
}
public void setResourceId(int resourceId) {
	this.resourceId = resourceId;
}
public List<ClassThree> getClassThree() {
	return ClassThree;
}
public void setClassThree(List<ClassThree> classThree) {
	ClassThree = classThree;
}



}

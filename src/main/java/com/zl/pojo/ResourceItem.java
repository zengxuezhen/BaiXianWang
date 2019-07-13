package com.zl.pojo;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ResourceItem {
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
private List<ClassThree> lassThree;
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
public List<ClassTwo> getClassTwo() {
	return classTwo;
}
public void setClassTwo(List<ClassTwo> classTwo) {
	this.classTwo = classTwo;
}


}

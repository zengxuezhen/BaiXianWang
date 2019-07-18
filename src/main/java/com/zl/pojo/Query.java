package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Query {
	/**
	  根据User中省,市,区查询
		根据资源物品单产地查询
		根据资源物品一级分类表(ClassOne)查询
		根据资源物品单资源物品名称查询
		根据资源物品单资源物品产地查询
		根据User用户名查询
	 */
private int qProvince;	
private int qClassone;
private int qClasstwo;
private int qClassThrere;
private String qproductName;
private String qcompanyName;
private String qorigin;
private int qUserid;

public String getQcompanyName() {
	return qcompanyName;
}
public void setQcompanyName(String qcompanyName) {
	this.qcompanyName = qcompanyName;
}
public int getqProvince() {
	return qProvince;
}
public void setqProvince(int qProvince) {
	this.qProvince = qProvince;
}

public int getqClassone() {
	return qClassone;
}
public void setqClassone(int qClassone) {
	this.qClassone = qClassone;
}
public int getqClasstwo() {
	return qClasstwo;
}
public void setqClasstwo(int qClasstwo) {
	this.qClasstwo = qClasstwo;
}
public int getqClassThrere() {
	return qClassThrere;
}
public void setqClassThrere(int qClassThrere) {
	this.qClassThrere = qClassThrere;
}
public String getQproductName() {
	return qproductName;
}
public void setQproductName(String qproductName) {
	this.qproductName = qproductName;
}
public String getQorigin() {
	return qorigin;
}
public void setQorigin(String qorigin) {
	this.qorigin = qorigin;
}
public int getqUserid() {
	return qUserid;
}
public void setqUserid(int qUserid) {
	this.qUserid = qUserid;
}
@Override
public String toString() {
	return "Query [qProvince=" + qProvince + ", qClassone=" + qClassone + ", qClasstwo=" + qClasstwo + ", qClassThrere="
			+ qClassThrere + ", qproductName=" + qproductName + ", qcompanyName=" + qcompanyName + ", qorigin="
			+ qorigin + ", qUserid=" + qUserid + "]";
}

}

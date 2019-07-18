package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Scope("prototype")
public class Resource{
	/**
	 *  主键ID，自增
		资源单id，外键，连接资源单
		资源单连接用户表id
		资源单联系电话
		资源单说明
		资源单上传日期

	 */
private int	id;
private int	listNo;
private int	 companyId;
private String	phoneNo;
private String	description;
@DateTimeFormat(pattern="yyyy-MM-dd")
@JsonFormat(pattern="yyyy-MM-dd",timezone="GTM+8")
private Date	submissionDate;
/**
 * 查询Resource的时候可以让mybatis级联给我查询他对应的所有的ResourceItem
 */
private ResourceItem resourceitem;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getListNo() {
	return listNo;
}
public void setListNo(int listNo) {
	this.listNo = listNo;
}

public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getSubmissionDate() {
	return submissionDate;
}
public void setSubmissionDate(Date submissionDate) {
	this.submissionDate = submissionDate;
}
public ResourceItem getResourceitem() {
	return resourceitem;
}
public void setResourceitem(ResourceItem resourceitem) {
	this.resourceitem = resourceitem;
}

}
package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class resource{
private int	id;
private int	listNo;
private int	 userId;
private String	phoneNo;
private String	description;
private Date	submissionDate;
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
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
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

}
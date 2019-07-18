package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
@Component
@Scope("prototype")
public class ResourceList {
private String	companyName;
private String	secondClassName;
private	String thirdClassName;
private	String description;
@DateTimeFormat(pattern="yyyy-MM-dd")
@JsonFormat(pattern="yyyy-MM-dd",timezone="GTM+8")
private	Date submissionDate;
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getSecondClassName() {
	return secondClassName;
}
public void setSecondClassName(String secondClassName) {
	this.secondClassName = secondClassName;
}
public String getThirdClassName() {
	return thirdClassName;
}
public void setThirdClassName(String thirdClassName) {
	this.thirdClassName = thirdClassName;
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
@Override
public String toString() {
	return "ResourceList [companyName=" + companyName + ", secondClassName=" + secondClassName + ", thirdClassName="
			+ thirdClassName + ", description=" + description + ", submissionDate=" + submissionDate + "]";
}

}

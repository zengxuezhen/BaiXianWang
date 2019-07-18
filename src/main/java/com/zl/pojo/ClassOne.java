package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassOne {
private int	id;
private int	firstClassId;
private String	firstClassName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getFirstClassId() {
	return firstClassId;
}
public void setFirstClassId(int firstClassId) {
	this.firstClassId = firstClassId;
}
public String getFirstClassName() {
	return firstClassName;
}
public void setFirstClassName(String firstClassName) {
	this.firstClassName = firstClassName;
}

}

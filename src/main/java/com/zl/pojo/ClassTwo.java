package com.zl.pojo;

import java.util.List;

public class ClassTwo {
private int	id;
private int	secondClassNo;
private int	firstClassId;
private String	secondClassName;
private List<ClassOne> classOne;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSecondClassNo() {
	return secondClassNo;
}
public void setSecondClassNo(int secondClassNo) {
	this.secondClassNo = secondClassNo;
}
public int getFirstClassId() {
	return firstClassId;
}
public void setFirstClassId(int firstClassId) {
	this.firstClassId = firstClassId;
}
public String getSecondClassName() {
	return secondClassName;
}
public void setSecondClassName(String secondClassName) {
	this.secondClassName = secondClassName;
}

}

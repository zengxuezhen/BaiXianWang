package com.zl.pojo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class ClassThree {
private int	id	;
private int	thirdClassNo;
private int	secondClassId;
private String	thirdClassName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getThirdClassNo() {
	return thirdClassNo;
}
public void setThirdClassNo(int thirdClassNo) {
	this.thirdClassNo = thirdClassNo;
}
public int getSecondClassId() {
	return secondClassId;
}
public void setSecondClassId(int secondClassId) {
	this.secondClassId = secondClassId;
}
public String getThirdClassName() {
	return thirdClassName;
}
public void setThirdClassName(String thirdClassName) {
	this.thirdClassName = thirdClassName;
}
@Override
public String toString() {
	return "ClassThree [id=" + id + ", thirdClassNo=" + thirdClassNo + ", secondClassId=" + secondClassId
			+ ", thirdClassName=" + thirdClassName + "]";
}

}

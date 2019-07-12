package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
/*
 * 银行账户信息表
 * */
public class BankAccount {
  private Integer id;//主键ID，自增
  private Integer userId;//外键，用来连接用户表主键ID
  private String accountName;//户名
  private String branch;//开户行
  private Integer accountNo;//账号
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Integer getAccountNo() {
	return accountNo;
}
public void setAccountNo(Integer accountNo) {
	this.accountNo = accountNo;
}

}

package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class QueryPurchase {
	//id
	private Integer id;
	//标题
	private String title;
	//采购产品
	private String product;
	//上传时间开始
	@DateTimeFormat(pattern="yyyy-MM-dd-hh-mmss")
	private Date startUploadTime;
	//上传时间开始结束
	@DateTimeFormat(pattern="yyyy-MM-dd-hh-mmss")
	private Date endUploadTime;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Date getStartUploadTime() {
		return startUploadTime;
	}
	public void setStartUploadTime(Date startUploadTime) {
		this.startUploadTime = startUploadTime;
	}
	public Date getEndUploadTime() {
		return endUploadTime;
	}
	public void setEndUploadTime(Date endUploadTime) {
		this.endUploadTime = endUploadTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
}

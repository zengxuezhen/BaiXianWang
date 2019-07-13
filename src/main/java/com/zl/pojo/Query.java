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
private String qClssone;
private String qClasstwo;
private String qClassThrere;
private String qproductName;
private String qorigin;
private int qUserid;

}

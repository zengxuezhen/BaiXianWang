package com.zl.pojo;
/**
 * 授权运营者信息表
 * */
public class AuthorizedOperator {
	private Integer id;                  //主键ID，自增
	private String operatorNo;           //授权运营编号
	private String operatorName;           //运营者姓名
	private String operatorPostion;           //运营者职务
	private String operatorPhone;           //运营者联系方式
	private String authorizedCertification;           //授权运营书
	private Integer companyId;           //企业ID，外键，连接企业表
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOperatorNo() {
		return operatorNo;
	}
	public void setOperatorNo(String operatorNo) {
		this.operatorNo = operatorNo;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorPostion() {
		return operatorPostion;
	}
	public void setOperatorPostion(String operatorPostion) {
		this.operatorPostion = operatorPostion;
	}
	public String getOperatorPhone() {
		return operatorPhone;
	}
	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}
	public String getAuthorizedCertification() {
		return authorizedCertification;
	}
	public void setAuthorizedCertification(String authorizedCertification) {
		this.authorizedCertification = authorizedCertification;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	

}

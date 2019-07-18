package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FenYePurchase {
	// 采购条件查询
	private QueryPurchase queryPurchase;
	// 当前请求页码
	private Integer page;
	// 每页显示多少条
	private Integer rows = 3;
	// 符合要求的记录总数
	private Integer rowCount;
	// 开始条数
	private Integer starRow;
	// 结束条数
	private Integer endRow;
	// 封装查询条件
	private Query query;

	// 一共多少页
	private Integer pageCount;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getStarRow() {
		starRow = (getPage() - 1) * getRows();
		return starRow;
	}

	public void setStarRow(Integer starRow) {
		this.starRow = starRow;
	}

	public Integer getEndRow() {
		endRow = getPage() * getRows();

		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public Integer getPageCount() {
		if(getRowCount()%getRows()==0) {
			pageCount=getRowCount()/getRows();
		}else {
			pageCount=getRowCount()/getRows()+1;
		}

		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public QueryPurchase getQueryPurchase() {
		return queryPurchase;
	}

	public void setQueryPurchase(QueryPurchase queryPurchase) {
		this.queryPurchase = queryPurchase;
	}

}

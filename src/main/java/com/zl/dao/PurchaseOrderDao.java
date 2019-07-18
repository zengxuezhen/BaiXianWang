package com.zl.dao;

import java.util.List;

import com.zl.pojo.FenYePurchase;
import com.zl.pojo.PurchaseOrder;

import com.zl.pojo.QueryPurchase;

public interface PurchaseOrderDao {

	/**
	 * 采购单多条件分页查詢
	 */
	public List<PurchaseOrder> queryPurchaseByFy(FenYePurchase fyp);

	/**
	 * 查询符合要求的采购单记录总数
	 * 
	 */
	public int queryPurchaseRowCount(QueryPurchase queryP);

	/**
	 * 添加采购单
	 */
	public int addPurchaseOrder(PurchaseOrder purchaseOrder);
	
	/**
	 * 根据ID查询采购单详情
	 */
	public PurchaseOrder queryPurchaseOrderById(int id);
}

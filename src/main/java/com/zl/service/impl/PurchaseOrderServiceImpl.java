package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.PurchaseOrderDao;
import com.zl.pojo.FenYePurchase;
import com.zl.pojo.PurchaseOrder;
import com.zl.pojo.QueryPurchase;
import com.zl.service.PurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
	@Autowired
	private PurchaseOrderDao pod;

	@Override
	public List<PurchaseOrder> queryPurchaseByFy(FenYePurchase fyp) {
		fyp.setRowCount(pod.queryPurchaseRowCount(fyp.getQueryPurchase()));
		if (fyp.getPage() == null) {
			fyp.setPage(1);
		}

		if (fyp.getPage() < 1) {
			fyp.setPage(1);
		}
		if (fyp.getPage() > fyp.getPageCount() && fyp.getPageCount() > 0) {
			fyp.setPage(fyp.getPageCount());
		}

		List<PurchaseOrder> po = pod.queryPurchaseByFy(fyp);

		return po;
	}

	@Override
	public int addPurchaseOrder(PurchaseOrder purchaseOrder) {
		int result = pod.addPurchaseOrder(purchaseOrder);
		return result;
	}

	@Override
	public PurchaseOrder queryPurchaseOrderById(String id) {
		PurchaseOrder po = pod.queryPurchaseOrderById(new Integer(id));
		return po;
	}

}

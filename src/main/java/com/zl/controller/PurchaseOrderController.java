package com.zl.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.FenYePurchase;
import com.zl.pojo.PurchaseOrder;
import com.zl.service.PurchaseOrderService;
import com.zl.service.impl.PurchaseOrderServiceImpl;

@Controller
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService pos;

	@RequestMapping("/purchaseOrderList ")
	public String PurchaseOrderList(Map<String, Object> map, FenYePurchase fyp) {
		List<PurchaseOrder> po = pos.queryPurchaseByFy(fyp);

		map.put("purchaseOrder", po);
		return "myPurchase.jsp";

	}

	@RequestMapping("/addPurchaseOrder")
	public ModelAndView addPurchaseOrder(PurchaseOrder purchaseOrder) {
		ModelAndView mv = new ModelAndView();
		pos.addPurchaseOrder(purchaseOrder);
		mv.setViewName("purchaseOrderList.jsp");
		return mv;

	}
    
	@RequestMapping("/toPurchasingDetails ")
	public ModelAndView toPurchasingDetails (HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String id = req.getParameter("id");
		PurchaseOrder po = pos.queryPurchaseOrderById(id);
		mv.addObject("purchaseOrder",po);
		mv.setViewName("purchasingDetails.jsp");
		return mv;
	}
}

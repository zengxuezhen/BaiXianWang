package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.ResourceListDao;
import com.zl.pojo.FenYe;
import com.zl.pojo.ResourceList;
import com.zl.service.ResourceListService;
@Service
public class ResourceListServiceimpl implements ResourceListService{
@Autowired
private ResourceListDao rd;
	@Override
	public List<ResourceList> queryAllResourceList(FenYe fy) {
		   fy.setRowCount(rd.queryRowCount(fy.getQuery()));
		   List<ResourceList> re=rd.queryAllResourceList(fy);
		return re;
	}
	

}

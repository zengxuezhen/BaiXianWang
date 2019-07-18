package com.zl.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zl.pojo.Resource;
import com.zl.pojo.ResourceItem;

public interface ResourceService {
	 /**
	  * 上传资源单
	  */
	public int addResource(Resource re,ResourceItem ri/*,int id*/) ;
	public List<Resource> queryResource(int id);
}

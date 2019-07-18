package com.zl.dao;

import java.util.Date;
import java.util.List;

import com.zl.pojo.Resource;

public interface ResourceDao {
 /**
  * 上传资源单
  */
	public int addResource(Resource re) ;
	public int queryResourcebyid(Date date);
	public List<Resource> queryResource(int id);
}

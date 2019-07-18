package com.zl.dao;

import java.util.List;

import com.zl.pojo.FenYe;
import com.zl.pojo.Query;
import com.zl.pojo.Resource;
import com.zl.pojo.ResourceList;

public interface ResourceListDao {
	/**
	 * 多条件分页查询
	 */
	public List<ResourceList> queryAllResourceList(FenYe fy);
	/**
	 * 查询符合要求的记录总数count(*)
	 */
	public int queryRowCount(Query query);
	/**
	 * 根据id查询
	 */
	public Resource queryResourceById(String id);

}

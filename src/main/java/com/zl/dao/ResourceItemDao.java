package com.zl.dao;
import java.util.List;

import com.zl.pojo.Query;
import com.zl.pojo.ResourceItem;
public interface ResourceItemDao {
public int addResourceItem(ResourceItem ri);
public List<ResourceItem> queryResourceItem(int id);
}

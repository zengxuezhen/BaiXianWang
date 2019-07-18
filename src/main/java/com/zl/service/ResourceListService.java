package com.zl.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.zl.pojo.FenYe;
import com.zl.pojo.ResourceList;
@Service
public interface ResourceListService  {
	public List<ResourceList> queryAllResourceList(FenYe fy);
}

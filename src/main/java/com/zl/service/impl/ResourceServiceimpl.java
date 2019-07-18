package com.zl.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.zl.dao.ResourceDao;
import com.zl.dao.ResourceItemDao;
import com.zl.pojo.Resource;
import com.zl.pojo.ResourceItem;
import com.zl.pojo.User;
import com.zl.service.ResourceService;

@Service
public class ResourceServiceimpl implements ResourceService {
	@Autowired
	private ResourceDao redao;
	@Autowired
	private ResourceItemDao ridao;
	@Override
	public int addResource(Resource re,ResourceItem ri/*,int id*/) {
		re.setCompanyId(1);
		re.setSubmissionDate(new Date());
		int i= redao.addResource(re);
	    int id=	redao.queryResourcebyid(re.getSubmissionDate());
	    ri.setResourceId(id);
        int y =ridao.addResourceItem(ri);
	    
		 return i+y;
	}
	@Override
	public List<Resource> queryResource(int id) {
		List<Resource> re=redao.queryResource(id);
		for (Resource resource : re) {
			ridao.queryResourceItem(resource.getId());
		}
		
	
		;
		return re;
	}

}

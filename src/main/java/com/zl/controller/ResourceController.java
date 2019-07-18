package com.zl.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zl.pojo.ClassThree;
import com.zl.pojo.FenYe;
import com.zl.pojo.Resource;
import com.zl.pojo.ResourceItem;
import com.zl.pojo.ResourceList;
import com.zl.service.ClassThreeSerice;
import com.zl.service.ResourceListService;
import com.zl.service.ResourceService;
@Controller
public class ResourceController {
	@Autowired
	private ClassThreeSerice three;
	@Autowired
	private ResourceService reSerivce;
	@Autowired
	private ResourceListService listse;
	@RequestMapping("/queryResource")
	@ResponseBody
	public  List<ClassThree> queryallResourceList(){
		return three.queryallClassThree();
	}
	@RequestMapping("/addResource")
	@ResponseBody
	public int  addallResource(ResourceItem ri,Resource re) {
		/*User user=(User) req.getSession().getAttribute("user");
		re.setCompanyId(user.getId());*/
		System.out.println(ri);
		return reSerivce.addResource(re,ri);
	}
	@RequestMapping("/queryResourceList")
	@ResponseBody
	public List<ResourceList> queryAllResourceList(FenYe fy){
		return listse.queryAllResourceList(fy);
	}
}

package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.ClassThreeDao;
import com.zl.pojo.ClassThree;
import com.zl.service.ClassThreeSerice;
@Service
public class ClassThreeSericeimpl implements ClassThreeSerice{
@Autowired
private ClassThreeDao three;

@Override
public List<ClassThree> queryallClassThree() {
	List<ClassThree> ct=three.queryallClassThree();
	return ct;
}

}

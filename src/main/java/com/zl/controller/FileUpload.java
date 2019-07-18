package com.zl.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
@Controller
public class FileUpload {
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String,Object> upload(String name,@RequestParam("imgFile") CommonsMultipartFile imgFile){
			Map<String,Object> map=new HashMap<>();
			if(imgFile.getSize()>0) {
				//获取原始文件名称
				String oldFileName=imgFile.getOriginalFilename();//aaa.jpg
				//创建新文件名称
				String newFileName=UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
				//创建新文件
				File newFile=new File("D:/apache-tomcat-8.0.50/webapps/img/"+newFileName);
				//如果文件不存在我们手动创建出来
				if(!newFile.exists()) {
					newFile.mkdir();
				}
				//把旧文件中的数据写新文件中
				try {
					imgFile.transferTo(newFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				map.put("flag", true);
				map.put("url", "../img/"+newFileName);
				System.out.println(newFileName+";;;;;;;;;;;;;;;;;;");
			}
			return map;
		}
}

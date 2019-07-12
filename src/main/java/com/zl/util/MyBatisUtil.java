package com.zl.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private SqlSessionFactory ssf;
	private static MyBatisUtil mbu = new MyBatisUtil();
	//用单例模式来获取连接
	//创建一个私有构造方法
	private MyBatisUtil() {
		//通过类加载器把主配置文件转换成输入流
		InputStream is=MyBatisUtil.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		//加载主配置文件获取SqlSessionFactory对象
		ssf=new SqlSessionFactoryBuilder().build(is);
	}
	//创建一个公有静态方法
	public static MyBatisUtil init() {
		return mbu;
	}
	//创建一个的获取SqlSession的方法
	public SqlSession getSqlSession() {
		return ssf.openSession();
	}
}

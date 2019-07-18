<%@page import="java.net.URLDecoder"%>

<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head lang="en">
<meta charset="UTF-8">
<title>供应商管理-采购管理-我的采购单</title>
<link rel="stylesheet" href="css/public.css" />
<link rel="stylesheet" href="css/page.css" />
<link rel="stylesheet" href="css/member.css" />
<link rel="stylesheet" href="css/banner.css" />
<link rel="stylesheet" href="css/tab.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/select.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/font-awesome-ie7.css">
<!--[if lt IE 10]>
    <script src="js/html5shiv.min.js"></script>
    <![endif]-->
</head>
<body>
	<!--网站顶部-->
	<div class="top">
		<div class="container">
			<div class="top-left">
				<p>欢迎来到超鲜网</p>
				<a href="javascript:;">请登录</a> <span>|</span> <a href="javascript:;">免费注册</a>
			</div>
			<div class="top-right">
				<ul>
					<li><a href="javascript:;">帮助中心&nbsp;&nbsp;|</a></li>
					<li><a href="javascript:;">我的关注&nbsp;&nbsp;|</a></li>
					<li><a href="javascript:;">联系客服&nbsp;&nbsp;|</a></li>
					<li><a href="javascript:;">网站导航&nbsp;&nbsp;|</a></li>
					<li><a href="javascript:;">客服热线：<span>400-888-8888</span>&nbsp;&nbsp;|
					</a></li>
				</ul>
				<div class="attention">
					<p>关注我们：</p>
					<a class="weixin" href="javascript:;"> <img
						src="images/top-icon01.png" alt="" />
						<div class="weixin-erweima">
							<i></i> <img src="images/erweima.png" alt="" />
						</div>
					</a> <a class="xl" href="javascript:;"><img
						src="images/top-icon02.png" alt="" /></a> <a class="tx"
						href="javascript:;"><img src="images/top-icon03.png" alt="" /></a>
					<span>|</span>
				</div>
				<a class="version" href="javascript:;">English</a>
			</div>
		</div>
	</div>
	<!--网站头部-->
	<header>
	<div class="container">
		<a href="javascript:;" class="logo"> <img src="images/logo.png"
			alt="" />
		</a>
		<div class="search">
			<div class="search-form">
				<div class="input">
					<input type="text" />
				</div>
				<div class="button">
					<button type="submit">
						<i class="fa fa-search"></i>
					</button>
				</div>
			</div>
			<div class="search-list">
				<a class="selected" href="javascript:;">A级牛肉</a> <span>|</span> <a
					href="javascript:;">进口猪肉</a> <span>|</span> <a href="javascript:;">A级排骨肉</a>
				<span>|</span> <a href="javascript:;">A级牛肉</a> <span>|</span> <a
					href="javascript:;">进口猪肉</a> <span>|</span> <a class="selected"
					href="javascript:;">A级排骨肉</a>
			</div>
		</div>
		<div class="cart">
			购物车中<span>0</span>件
		</div>
	</div>
	</header>
	<!--网站导航-->
	<nav>
	<div class="container">
		<dl>
			<dt>
				<a class="pro-all" href="javascript:;">商品全部分类&nbsp;&nbsp;<i
					class="fa fa-sort-desc fa-caret-up"></i></a>
				<ul>
					<li class="pro-sort">
						<div class="sort-first">
							<i class="fa fa-angle-right"></i> <a class="tit" href="">水产海鲜类</a>
							<div class="con">
								<a href="">鱼类</a> <a href="">贝类</a> <a href="">虾蟹类</a>
							</div>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
					<li class="pro-sort">
						<div class="sort-first">
							<i class="fa fa-angle-right"></i> <a class="tit" href="">禽类</a>
							<div class="con">
								<a href="">猪</a> <a href="">牛</a> <a href="">羊</a> <a href="">鸡</a>
								<a href="">鸭</a>
							</div>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
					<li class="pro-sort">
						<div class="sort-first">
							<i class="fa fa-angle-right"></i> <a class="tit" href="">粮油副食类</a>
							<div class="con">
								<a href="">大米类</a> <a href="">食用油类</a> <a href="">杂粮类</a>
							</div>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
					<li class="pro-sort">
						<div class="sort-first">
							<i class="fa fa-angle-right"></i> <a class="tit" href="">熟食调理类</a>
							<div class="con">
								<a href="">肉丸类</a> <a href="">水饺类</a>
							</div>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
					<li class="pro-sort">
						<div class="sort-first">
							<i class="fa fa-angle-right"></i> <a class="tit" href="">调料类</a>
							<div class="con">
								<a href="">酱料类</a>
							</div>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
					<li class="pro-sort">
						<div class="sort-first">
							<a class="tit" href="">其他</a>
						</div>
						<div class="sort-second">
							<div class="second-list">
								<a class="second-tit" href="">鱼类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a><span>|</span><a href="">多春鱼</a><span>|</span><a
										href="">黄花鱼</a><span>|</span><a href="">龙利鱼</a><span>|</span><a
										href="">三文鱼</a><span>|</span><a href="">银鳕鱼</a><span>|</span><a
										href="">鳗鱼</a><span>|</span><a href="">金枪鱼</a><span>|</span><a
										href="">鲍鱼</a><span>|</span><a href="">带鱼</a><span>|</span><a
										href="">秋刀鱼</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">贝类<i class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">北极贝</a><span>|</span><a href="">青口贝</a><span>|</span><a
										href="">扇贝</a>
								</div>
							</div>
							<div class="second-list">
								<a class="second-tit" href="">虾蟹类<i
									class="fa fa-angle-right"></i></a>
								<div class="second-con">
									<span>|</span><a href="">红虾</a><span>|</span><a href="">基围虾</a><span>|</span><a
										href="">波士顿龙虾</a><span>|</span><a href="">海虎虾</a><span>|</span><a
										href="">大闸蟹</a><span>|</span><a href="">帝王蟹</a><span>|</span><a
										href="">阿拉斯加蟹脚</a><span>|</span><a href="">雪蟹</a>
								</div>
							</div>
							<a class="second-add" href=""><img
								src="images/sort-add01.jpg" alt="" /></a>
						</div>
					</li>
				</ul>
			</dt>
			<dd>
				<a class="selected" href="javascript:;">首页</a>
			</dd>
			<dd>
				<a href="javascript:;">资源</a>
			</dd>
			<dd>
				<a href="javascript:;">采购</a>
			</dd>
			<dd>
				<a href="javascript:;">搜索</a>
			</dd>
			<dd>
				<a href="javascript:;">物流</a>
			</dd>
			<dd>
				<a href="javascript:;">行情</a>
			</dd>
			<dd>
				<a href="javascript:;">积分商城</a>
			</dd>
			<dd>
				<a href="javascript:;">会员俱乐部</a>
			</dd>
		</dl>
	</div>
	</nav>
	<!-- 内容主体区 -->
	<div class="content-main">
		<div class="container">
			<!-- 面包屑导航 -->
			<div class="bread-crumbs">
				<a href="javascript:;">首页</a> <span><i
					class="fa fa-angle-double-right"></i></span> <a href="javascript:;">会员中心</a>
				<span><i class="fa fa-angle-double-right"></i></span> <a
					href="javascript:;">采购管理</a> <span><i
					class="fa fa-angle-double-right"></i></span> <a href="javascript:;"
					class="selected">我的采购单</a>
			</div>
			<!-- 会员左侧 -->
			<div class="member-left">
				<dl>
					<dt>会员中心</dt>
					<dd>
						<a href="javascript:;" class="menuPro-first">基本信息</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的收藏</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的关注</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">账户安全</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的积分</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的站内信<span
							style="color: #b0e78e;">(8)</span></a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">升级会员</a>
					</dd>
					<dt>供应商管理</dt>
					<dd>
						<a href="javascript:;" class="menuPro-first"><i
							class="fa fa-plus-square"></i>我的资源单</a>
						<div class="menuPro-second">
							<a href="javascript:;"><i class="fa fa-angle-right"></i>上传资源单</a>
							<a href="javascript:;"><i class="fa fa-angle-right"></i>资源预览</a>
							<a href="javascript:;"><i class="fa fa-angle-right"></i>修改价格发布</a>
							<a href="javascript:;"><i class="fa fa-angle-right"></i>待审核资源单</a>
							<a href="javascript:;"><i class="fa fa-angle-right"></i>已关闭资源单</a>
						</div>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我参与的竞标</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我收到的订单</a>
					</dd>
					<dt>采购管理</dt>
					<dd>
						<a href="javascript:;" class="menuPro-first selected">我的采购单</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的订单</a>
					</dd>
					<dt>托运管理</dt>
					<dd>
						<a href="javascript:;" class="menuPro-first">我要找车</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的托运信息</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的托运单</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">使用过的托运商</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">关注的承运商</a>
					</dd>
					<dt>承运管理</dt>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的车辆</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的路线</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">承运简介</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的网点</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我参与的竞价</a>
					</dd>
					<dd>
						<a href="javascript:;" class="menuPro-first">我的承运单</a>
					</dd>
				</dl>
			</div>
			<!-- 会员右侧 -->
			<div class="member-right">
				<!-- 搜索列表 -->
				<form action="">
					<div class="search-member">
						<dl>
							<dd>
								<label for="">
									<p>标题：</p> <input type="text" class="input02 w125"
									name="queryPurchase.title"
									value="${fenYePurchase.queryPurchase.title}" />
								</label> <label for="">
									<p>采购产品：</p> <input type="text" class="input02 w125"
									name="queryPurchase.product"
									value="${fenYePurchase.queryPurchase.product }" />
								</label>
							</dd>
							<dd>
								<label for="">
									<p>上传时间：</p> <input type="text" class="input02 w125 date" /> <select
									class="w100">
										<option value="0">请选择</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
								</select> <span>时</span> <input type="text" class="input02 w45" /> <span>分</span>
								</label> <label for=""> <span>至</span> <input type="text"
									class="input02 w125 date" /> <select class="w100">
										<option value="0">请选择</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
								</select> <span>时</span> <input type="text" class="input02 w45" /> <span>分</span>
								</label>
								<div class="search-btn">
									<input type="submit" class="btn03" value="检索"> <a
										href="publishPurchase .jsp" class="btn02">发布采购单</a>
								</div>
				</form>
				</dd>
				</dl>
			</div>
			<div class="lib-tab5">
				<table>
					<thead>
						<tr>
							<th style="width: 150px;">编号</th>
							<th>标题</th>
							<th style="width: 200px;">采购说明</th>
							<th style="width: 200px;">发布时间</th>
							<th style="width: 120px;">状态</th>
							<th style="text-align: center;">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${purchaseOrder}" var="po">
							<tr>
								<td>${po.purchaseOrderNo }</td>
								<td>${po.purchaseOrderName }</td>
								<td>${po.purchaseDescription }</td>
								<td><fmt:formatDate value='${po.submissionDate}'
										pattern='yyyy-MM-dd HH:mm:ss' /></td>
								<td><span style="color: #e42122;"> <c:if test="${po.futureSpot==0 }">期货</c:if>
								<c:if test="${po.futureSpot==1 }">现货</c:if>  </span></td>
								<td><a href="toPurchasingDetails?id=${po.id} " class="btn04">详细</a> <a
									href="javascript:;" class="btn04">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<!-- page -->
				<div class="list-page">
					
					<c:url var="purchaseOrderPath" value="purchaseOrderList">
						<c:param name="title" value="${fenYePurchase.queryPurchase.title  }"></c:param>
						<c:param name="product" value="${fenYePurchase.queryPurchase.product  }"></c:param>
					</c:url>
					 <ul>
	                
	                    <li><a href="${purchaseOrderPath }&page=1">首页</a></li>
	                    <c:choose>
							<c:when test="${fenYePurchase.page ==1 }">
								 <li><a href="javascript:;" class="prev-listPage prev-disable">上一页</a></li>
							</c:when>
							<c:otherwise>
								 <li><a href="${purchaseOrderPath }&page=${fenYePurchase.page-1 }">上一页</a></li>
							</c:otherwise>
						</c:choose>	
						<li><a href="javascript:;"id="hover-listPage">${fenYePurchase.page }</a></li>
						<c:choose>
							<c:when test="${fenYePurchase.page == fenYePurchase.pageCount }">
								 <li><a href="javascript:;" class="next-listPage">下一页</a></li>
							</c:when>
							<c:otherwise>
								 <li><a href="${purchaseOrderPath }&page=${fenYePurchase.page+1 }" class="next-listPage">下一页</a></li>
							</c:otherwise>
						</c:choose>	
						<li><a href="${purchaseOrderPath }&page=${fenYePurchase.pageCount }">尾页</a></li>
	                    <li><span>总共</span><input type="text" readonly="readonly" value="${fenYePurchase.pageCount }"><span>页</span></li>
	                    <li><span>跳到第</span><input type="text"><span>页</span></li>
	                    <li><a href="javascript:;" class="jump-page" >确定</a></li>
	                </ul>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!--网站底部-->
	<footer>
	<div class="footer-top">
		<div class="container">
			<div class="footer-left">
				<div class="footer-logo">
					<img src="images/logo.png" alt="" />
				</div>
				<div class="footer-tel">
					<h6>服务热线：</h6>
					<p>400-888-8888</p>
				</div>
			</div>
			<div class="footer-nav">
				<dl
					style="background: url(images/footer-icon01.png) no-repeat top left;">
					<dt>
						<a href="javascript:;">购物指南</a>
					</dt>
					<dd>
						<a href="">购物流程</a><a href="">订货方式</a><a href="">联系客服</a><a
							href="">交易条款</a>
					</dd>
				</dl>
				<dl
					style="background: url(images/footer-icon02.png) no-repeat top left;">
					<dt>
						<a href="javascript:;">支付方式</a>
					</dt>
					<dd>
						<a href="">银行付款</a><a href="">在线支付</a><a href="">组合支付</a>
					</dd>
				</dl>
				<dl
					style="background: url(images/footer-icon03.png) no-repeat top left;">
					<dt>
						<a href="javascript:;">物流帮助</a>
					</dt>
					<dd>
						<a href="">如何找车</a><a href="">常见问题</a><a href="">运送流程</a>
					</dd>
				</dl>
				<dl
					style="background: url(images/footer-icon04.png) no-repeat top left;">
					<dt>
						<a href="javascript:;">售后服务</a>
					</dt>
					<dd>
						<a href="">售后服务总则</a><a href="">服务政策</a>
					</dd>
				</dl>
				<dl
					style="background: url(images/footer-icon05.png) no-repeat top left;">
					<dt>
						<a href="javascript:;">帮助中心</a>
					</dt>
					<dd>
						<a href="">网点分布</a><a href="">加盟商区</a>
					</dd>
				</dl>
			</div>
		</div>
	</div>
	<div class="copy">
		<div class="copy-nav">
			<a href="javascript:;">关于我们</a> <span>|</span> <a href="javascript:;">法律声明</a>
			<span>|</span> <a href="javascript:;">诚聘英才</a> <span>|</span> <a
				href="javascript:;">联系我们</a> <span>|</span> <a href="javascript:;">友情链接</a>
		</div>
		<p>
			Copyright <i class="fa fa-copyright"></i> 超鲜网 粤ICP备 13013915号-3
			ICP证：粤B2-201401448
		</p>
	</div>
	</footer>
	<!-- 预览大图 -->
	<div class="mask">
		<div class="bg-mask"></div>
		<div class="bigPic">
			<div class="tit">
				<p>查看大图</p>
				<i class="fa fa-times-circle-o"></i>
			</div>
			<div class="img">
				<img src="" alt="">
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="js/global.js"></script>
	<script type="text/javascript" src="js/jquery.accordion.js"></script>
	<script type="text/javascript" src="js/select.js"></script>
</body>
</html>
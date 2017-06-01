<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>关于我们</title>
<link href="<%=path %>/resources/weui/dist/style/weui.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="page">
 	<div class="page__hd">
        <h1 class="page__title">关于微商城</h1>
    </div>
    <div class="page__bd">
        <article class="weui-article">
            <p style="font-size:40px;">
              	  微商城是基于当前很受欢迎的微信的一种传媒方式中的一种商业运用，微信当前的火热是一个商机，基于微信的传播速度，及其简便等优点，为商家提供一个平台，在这个更简便的、方便的平台里进行更为现代的电子商务。同时在利用微信的这个平台也可以为商家提供更有效的宣传方式，更有利于商品的推广。
            </p>
            <p align="center">
                <img src="<%=path %>/resources/weui/dist/example/images/pic_article.png" alt="">
                <img src="<%=path %>/resources/weui/dist/example/images/pic_article.png" alt="">
            </p>
        </article>
    </div>
    <div class="page__ft">
        <a href="javascript:home()"><img src="./images/icon_footer_link.png" /></a>
    </div>
</div>

<div class="page">
    <div class="page__bd page__bd_spacing">
        <div class="weui-footer weui-footer_fixed-bottom">
            <p class="weui-footer__links">
                <a href="<%=path %>/index.html" class="weui-footer__link" style="font-size:30px;">微商城首页</a>
            </p>
            <p class="weui-footer__text" style="font-size:20px;">Copyright &copy; 2008-2017 微商城所有</p>
        </div>
    </div>
</div>
</body>
</html>
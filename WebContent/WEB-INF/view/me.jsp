<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>
<div style="width: 100%;height: 400px;background-color:#2a5caa " align="center">
	<img style="width: 200px;height:200px ;margin:40px 50px" src="${sessionScope.userInfoMap.headimgurl }">
	<p style="font-size:45px;">${sessionScope.userInfoMap.nickname }</p>
</div>

<div class="page">
    <div class="page__bd">
        <div class="weui-cells">
            <div class="weui-cell weui-cell_access">
                <div class="weui-cell__bd" style="height:60px">
                    <span style="vertical-align: middle"><p style="font-size:45px;">我的订单</p></span>
                    <!-- <span class="weui-badge" style="margin-left: 5px;">8</span> -->
                </div>
                <div class="weui-cell__ft"></div>
            </div>
            <div class="weui-cell weui-cell_access">
                <div class="weui-cell__bd" style="height:60px">
                    <span style="vertical-align: middle"><p style="font-size:45px;">我的收藏</p></span>
                    <!-- <span class="weui-badge" style="margin-left: 5px;">8</span> -->
                </div>
                <div class="weui-cell__ft"><p style="font-size:35px;">详细信息</p></div>
            </div>
            <div class="weui-cell weui-cell_access">
                <div class="weui-cell__bd" style="height:60px">
                    <span style="vertical-align: middle"><p style="font-size:45px;">我的地址</p></span>
                    <!-- <span class="weui-badge" style="margin-left: 5px;">New</span> -->
                </div>
                <div class="weui-cell__ft"></div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
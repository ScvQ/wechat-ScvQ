<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微商城</title>
<link href="<%=path %>/resources/weui/dist/style/weui.css" rel="stylesheet" type="text/css" />
<script src="<%=path %>/resources/weui/dist/example/zepto.min.js"></script>
<script src="<%=path%>/resources/js/jquery-3.1.1.min.js"></script>
</head>
<body>

<div id="index"></div>

<div class="page">
    <div class="page__bd" style="height: 100%;">
        <div class="weui-tab">
            <div class="weui-tab__panel">
            </div>
            <div class="weui-tabbar" style="position:fixed; bottom:0; left:0; width:100%; height:10%; _position:absolute;">
                <a href="javascript:;" class="weui-tabbar__item weui-bar__item_on" onclick="index()">
                   <!--  <span style="display: inline-block;position: relative;"> -->
                        <img style="width:40%; height: 65%;" src="<%=path %>/resources/weui/dist/example/images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                        <!-- <span class="weui-badge" style="position: absolute;top: -2px;right: -13px;">8</span> -->
                    <!-- </span> -->
                    <p style="font-size:30px;" class="weui-tabbar__label">首页</p>
                </a>
                <a href="javascript:;" class="weui-tabbar__item" onclick="sort()">
                    <img style="width:40%; height: 65%;" src="<%=path %>/resources/weui/dist/example/images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    <p style="font-size:30px;" class="weui-tabbar__label">商品分类</p>
                </a>
                <a href="javascript:;" class="weui-tabbar__item" onclick="shopcart()">
                    <!-- <span style="display: inline-block;position: relative;"> -->
                        <img style="width:40%; height: 65%;" src="<%=path %>/resources/weui/dist/example/images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                        <!-- <span class="weui-badge weui-badge_dot" style="position: absolute;top: 0;right: -6px;"></span> -->
                   <!--  </span> -->
                    <p style="font-size:30px;" class="weui-tabbar__label">购物车</p>
                </a>
                <a href="javascript:;" class="weui-tabbar__item" onclick="me()">
                    <img style="width:40%; height: 65%;" src="<%=path %>/resources/weui/dist/example/images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    <p style="font-size:30px;" class="weui-tabbar__label">我</p>
                </a>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

    $(function(){
        $('.weui-tabbar__item').on('click', function () {
            $(this).addClass('weui-bar__item_on').siblings('.weui-bar__item_on').removeClass('weui-bar__item_on');
        });
    });
    
    function index(){
  		$.ajax({
              url:'<%=path%>/index.html',
              type:'get',
              data:{projectId:null},
              dataType:'html',
              async:true,
              success:function(data) {
              	  document.getElementById("index").innerHTML = '';
               	  $("#index").prepend(data);
              }
          });
    }
    
    function me(){
  		$.ajax({
              url:'<%=path%>/me.html',
              type:'get',
              data:{projectId:null},
              dataType:'html',
              async:true,
              success:function(data) {
              	document.getElementById("index").innerHTML = '';
             		$("#index").prepend(data);
              }
          });
    }
    
    function sort(){
  		$.ajax({
              url:'<%=path%>/sort.html',
              type:'get',
              data:{projectId:null},
              dataType:'html',
              async:true,
              success:function(data) {
              	document.getElementById("index").innerHTML = '';
              	$("#index").prepend(data);
              }
          });
    }
    
    function shopcart(){
		$.ajax({
	           url:'<%=path%>/shopcart.html',
	           type:'get',
	           data:{projectId:null},
	           dataType:'html',
	           async:true,
	           success:function(data) {
	           	document.getElementById("index").innerHTML = '';
	           	$("#index").prepend(data);
	           }
	       });
    }
</script>

</body>
</html>
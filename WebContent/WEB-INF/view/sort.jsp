<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="page">
    <div class="page__bd" style="height: 100%;">
        <div class="weui-tab">
           <div class="weui-navbar" style="height:130px;">
                <div onclick="one()" class="weui-navbar__item weui-bar__item_on">
                    	<p style="font-size:70px;">类别一</p>
                </div>
                <div onclick="two()" class="weui-navbar__item">
                    	<p style="font-size:70px;">类别二</p>
                </div>
                <div onclick="three()" class="weui-navbar__item">
                    	<p style="font-size:70px;">类别三</p>
                </div>
            </div>
            <div id="zero" class="weui-tab__panel">
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
$.ajax({
    url:'<%=path%>/product/list.html',
    type:'get',
    data:{
    	type:1
	},
    dataType:'html',
    async:true,
    success:function(data) {
    	  document.getElementById("zero").innerHTML = '';
     	  $("#zero").prepend(data);
    }
});
	function one(){
		$.ajax({
            url:'<%=path%>/product/list.html',
            type:'get',
            data:{
            	type:1
			},
            dataType:'html',
            async:true,
            success:function(data) {
            	  document.getElementById("zero").innerHTML = '';
             	  $("#zero").prepend(data);
            }
        });
	}
	
	function two(){
		$.ajax({
            url:'<%=path%>/product/list.html',
            type:'get',
            data:{
            	type:2
			},
            dataType:'html',
            async:true,
            success:function(data) {
            	  document.getElementById("zero").innerHTML = '';
             	  $("#zero").prepend(data);
            }
        });
	}
	function three(){
		$.ajax({
            url:'<%=path%>/product/list.html',
            type:'get',
            data:{
            	type:3
			},
            dataType:'html',
            async:true,
            success:function(data) {
            	  document.getElementById("zero").innerHTML = '';
             	  $("#zero").prepend(data);
            }
        });
	}

    $(function(){
        $('.weui-navbar__item').on('click', function () {
            $(this).addClass('weui-bar__item_on').siblings('.weui-bar__item_on').removeClass('weui-bar__item_on');
        });
    });
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="height:85px "></div>
<c:forEach items="${list }" var="item">
	<div style="width:49%;height:600px;border:1px solid #000;float:left;margin-left:5px;margin-bottom:5px">
		${item.name }
	</div>
</c:forEach>

</body>
</html>
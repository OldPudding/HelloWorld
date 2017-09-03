<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<a href="add">添加用户</a><br>
	--------------------------------------------------------------<br>
	<c:forEach items="${users }" var="user">
		${user.value.userName } ------- ${user.value.realName } ------ ${user.value.email }</br>
	</c:forEach>
</body>
</html>
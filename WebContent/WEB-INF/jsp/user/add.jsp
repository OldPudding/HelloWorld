<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 没有写action，会提交到本地址，即/add -->
<sf:form method="post" modelAttribute="user">
	用户名：<sf:input path="userName" /><br/>
	密码：<sf:input path="password" /><br/>
	真名：<sf:input path="realName" /><br/>
	emial:<sf:input path="email" /><br/>
	<input type="submit" value="添加用户"/>	
</sf:form>
</body>
</html>
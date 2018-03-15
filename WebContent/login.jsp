<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/loginServlet" method="post">
		${message } <br>
		学号:<input type="text" name="num"><br>
		密码:<input type="password" name="password"><br>
		<input type="submit" value="login"><br>
		<a href="${pageContext.request.contextPath }/toRegisterServlet">注册</a>
	
	</form>                 							
</body>
</html>
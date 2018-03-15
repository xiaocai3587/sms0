<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/registerServlet" method="post">
		学号:<input type="text" name="num"><br>
		密码:<input type="password" name="password"><br>
		名字:<input type="text" name="name"><br>
		年龄:<input type="text" name="age"><br>
		成绩:<input type="text" name="score"><br>
		<input type="submit" value="register"><br>
	</form>
</body>
</html>
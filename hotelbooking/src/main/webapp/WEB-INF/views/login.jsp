<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mnazarenka
  Date: 2019-08-31
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>
<p>Login</p>
<br>
<c:if test= "${not empty param.error}">
    <span style="font-size: x-small; color: red; "><b>Неправильный логин или пароль</b></span>
</c:if>
<form action="${pageContext.request.contextPath}/login" method="post">
    Email:<input type="text" name="mail">
    Пароль:<input type="text" name="password">
    <input type="submit" value="Submit">
</form>
</body>
</html>

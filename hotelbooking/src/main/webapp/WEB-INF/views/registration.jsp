<%--
  Created by IntelliJ IDEA.
  User: mnazarenka
  Date: 2019-08-31
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>registration</title>
</head>
<body>
<p>Registration</p>
<br>
<form:form method="POST" action="registration" modelAttribute="user">
    <form:label path="firstName">Имя</form:label>
    <form:input path="firstName"/>
    <form:label path="secondName">Фамилия</form:label>
    <form:input path="secondName"/>
    <form:label path="login">Email</form:label>
    <form:input path="mail"/>
    <form:label path="password">Пароль</form:label>
    <form:input path="password"/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>

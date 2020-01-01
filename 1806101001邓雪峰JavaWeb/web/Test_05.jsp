<%@ page import="edu.sctu.model.User" %>
<%@ page import="edu.sctu.model.UserDao" %>
<%@ page import="edu.sctu.model.UserDaoimpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/29
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    用户名：<input name="username"/>
    密码：<input name="password"/>
    <button type="submit" value="提交"/>
    <button type="reset" value="重置"/>
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    System.out.println(username+password);

    User user = new User(username,password);

    UserDao userDao = new UserDaoimpl();
    userDao.saveUser(user);
%>
</body>
</html>

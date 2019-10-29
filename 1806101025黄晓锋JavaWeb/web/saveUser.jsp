<%@ page import="edu.sctu.model.User" %>
<%@ page import="edu.sctu.dao.UserDao01" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019/10/29
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //1.接收用户输入信息
    String username = request.getParameter("username");

    String password = request.getParameter("password");

    System.out.println(username+password);

    User user = new User(username,password);

    //2.保存到数据库
    UserDao01 userDao01 = new UserDaoImpl();
    userDao01.saveUser(user);
%>

</body>
</html>

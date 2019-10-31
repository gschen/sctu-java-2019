<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/29
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

//1增加

    System.out.println(username+password);
    User user = new User(username,password);
    UserDao userDao = new UserDaoImpl();
    userDao.updateUser(user);;




%>
</body>
</html>

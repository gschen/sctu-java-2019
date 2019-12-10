<%@ page import="edu.sctu.model.User" %>
<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImplV2" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/1
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    //1.接受用户的信息
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(username+password);
    User user = new User(username,password);

    //2.保存到数据库。
    UserDao userDao = new UserDaoImplV2();
    userDao.updateUser(user);

%>
</body>
</html>

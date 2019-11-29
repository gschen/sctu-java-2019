<%@ page import="edu.sctu.model.User" %>
<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/29
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String id = request.getParameter("userId");
    System.out.println(id);
    UserDao userDao = new UserDaoImpl();
    userDao.deleteById(id);
%>
<a href="userLlist.jsp">返回列表</a>
</body>
</html>

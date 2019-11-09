<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl2" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/7
  Time: 20:12
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
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(id+username+password);
    UserDao userDao = new UserDaoImpl2();

    userDao.updateUser(id,username,password);

%>
<a href="userLlist.jsp">返回列表</a>
</body>
</html>

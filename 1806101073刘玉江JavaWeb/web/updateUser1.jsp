<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/29
  Time: 11:49
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
    userDao.updateUser(parseInt(id));
%>
<form action="updateUser.jsp" method="post">
    用户名：<input type="text" name = "username" placeholder="用户名">
    密码：<input type="password" name = password placeholder="密码">
    <input type="submit" value="保存">
</form>
</body>
</html>

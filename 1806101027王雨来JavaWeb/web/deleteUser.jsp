<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/10/29
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="test_04.jsp">list</a>
<h1>DELETE SUCCESS!</h1>
<%
    //1.得到用户的id
    String id = request.getParameter("userId");
    System.out.println(id);
    //2.删除
    UserDao userDao = new UserDaoImpl();
    userDao.deleteById(Integer.parseInt(id));
%>
</body>
</html>

<%@ page import="edu.sctu.dao.UserDao01" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019/10/29
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body>

<%
    //1.得到删除用户的id
    String id = request.getParameter("userId");

    System.out.println(id);

    //2.执行数据库的删除操作
    UserDao01 userDao01 = new UserDaoImpl();
    userDao01.deleteById(Integer.parseInt(id));
%>

</body>
</html>

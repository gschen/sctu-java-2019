<%@ page import="edu.sctu.model.UserDao" %>
<%@ page import="edu.sctu.model.UserDaoimpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/29
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>no</title>
</head>
<body>
    <%
        UserDao userDao = new UserDaoimpl();
        List<User> userList = userDao.selectAll();
    %>

</body>
</html>

<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
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
    String id = request.getParameter("userId");
    System.out.println(id);
%>
<a href="userLlist.jsp">返回列表</a>
<form method="post" action="doUpdate.jsp">
    id:<input type="text" name = "userId" value="<%=id%>">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="更新">
</form>
</body>
</html>

<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/10/29
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>删除操作</td>
    </tr>
</table>
<%!
    private User user;
%><%
    UserDao userDao = new UserDaoImpl();

    userDao.updateUser(user);


%>


</body>
</html>

<%@ page import="edu.sctu.dao.UserDao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDao.UserDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UserDao userDao = new UserDaoImpl();
    List<User> userList = userDao.selectAll();

%>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
    </tr>
<%--<table>
    <tr><td>id</td><td>username</td><td>password</td></tr>
</table>--%>
<%
    for (User user : userList){
        System.out.println(user.getId()+user.getUsername()+user.getPassword());
        out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr><br/>");
    }
%>
</body>
</html>

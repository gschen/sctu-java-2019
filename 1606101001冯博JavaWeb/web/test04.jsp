<%@ page import="edu.sctu.UserDao" %>
<%@ page import="edu.sctu.UserDaoImpl" %>
<%@ page import="javax.swing.*" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
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
    <tr><td>id</td><td>username</td><td>password</td></tr>
    <%
        for(User user : userList){
            out.print("<tr><td>"+user.getId()+"</td><td>"+user.getUsename()+"</td><td>"+ user.getPassword()+"</td>");
        }
    %>
</table>
</body>
</html>

<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-10-29
  Time: 9:45
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
        for (User user : userList){
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");
        }
    %>
</table>

</body>
</html>

<%@ page import="edu.sctu.dao.UserDao01" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019/10/29
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>

    <%
        UserDao01 userDao01 = new UserDaoImpl();

        List<User> usersList = userDao01.selectAll();
    %>

    <table>
        <tr>
            <td>id</td>
            <td>username</td>
            <td>password</td>
        </tr>

    <%
        for (User user : usersList){
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");
        }
    %>
    </table>

</body>
</html>

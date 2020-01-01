<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zyx99
  Date: 2019/10/29
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    UserDao userDao = new UserDaoImpl();
    List<User> userList = userDao.selectAll();

</head>
<body>
    <table>
        <tr><td>id</td><td>username</td><td>password</td></tr>
    </table>
    <%
        for (User user : userList){

            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");
        }

    %>
</body>
</html>

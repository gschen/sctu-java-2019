<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/10/29
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="test_05.jsp">+</a>
<%
    UserDao userDao = new UserDaoImpl();

    List<User> userList = userDao.selectAll();

%>
<table border="3">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>更新操作</td>
        <td>删除操作</td>
    </tr>
    <%
        for(User user:userList){
            out.write("<tr>" +
                    "<td>" + user.getId() + "</td>" +
                    "<td>" + user.getUsername() + "</td>" +
                    "<td>" + user.getPassword() + "</td>" +
                    "<td><a href='updateInput.jsp'>更新</a></td>" +
                    "<td><a href='deleteUser.jsp?userId=" + user.getId() + "'>删除</a></td>" +
                    "</tr>");
        }
    %>
</table>


</body>
</html>

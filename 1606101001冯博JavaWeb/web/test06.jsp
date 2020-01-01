<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/1
  Time: 15:58
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

        </tr>

        <%
           List<User> userList = (List<User>) request.getAttribute("userList");

            for(User user : userList){
                out.print("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+ user.getPassword()+"</td>");
            }
        %>

        ${requestScope.userList}

    </table>
</body>
</html>

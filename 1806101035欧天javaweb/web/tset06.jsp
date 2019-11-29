<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
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
        <td >删除</td >
    </tr>
    <%
        List<User>userList=(List<User>) request.getAttribute("userList");
        for(User user :userList) {
            out.write("<tr><td>" + user.getId() + "</td><td>" + user.getUsername() + "</td><td>" + user.getPassword() + "</td></tr>");
        }
    %>
</table>
</body>
</html>

<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/1
  Time: 15:31
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
</table>
<%
    List<User> userList = (List<User>) request.getAttribute("userList");
    for (User user:userList){
        out.write("<tr><td>"+user.getId()+"</td></tr>"+user.getUsername());
    }
%>

</body>
</html>

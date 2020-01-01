<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/1
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--prefix前缀--%>
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

    <%--<%
        List<User> userList = (List<User>) request.getAttribute("userList");
        for(User user:userList){
            out.write("<tr><td>" + user.getId()+"</td><td>"+user.getUsername()
                    +"</td><td>"+user.getPassword()+"</td><td>" +
                    "<a href='deleteUser.jsp?userId="+user.getId()+"'>删除</a></td></tr>");
        }
    %>--%>

    <c:forEach var="userlist" items="${requestScope.userList}">
        <tr>
            <td>${userlist.id}</td>
            <td>${userlist.username}</td>
            <td>${userlist.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

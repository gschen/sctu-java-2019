<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/5
  Time: 11:53
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

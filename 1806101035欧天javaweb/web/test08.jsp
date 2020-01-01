<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/5
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <td></td>
    </tr>

    <c:forEach var="user" items="${sessionScope.userList}">
        <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td></td>
        </tr>
    </c:forEach>>
</table>

</body>
</html>

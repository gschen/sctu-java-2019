<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/15
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${applicationScope.userList}" var="user">
    <table>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </table>

</c:forEach>
</body>
</html>

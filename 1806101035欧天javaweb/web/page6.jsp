<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/15
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<c:forEach items="${applicationScope.userList}" var="user">
    <tr>
        <td>${user:id}</td>
        <td>${user:username}</td>
        <td>${user:password}</td>
    </tr>
</c:forEach>
</table>

</body>
</html>

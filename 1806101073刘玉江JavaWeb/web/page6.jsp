<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/15
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <c:forEach items="${applicationScope.userList}" var = "user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td><br/>
            </tr>

        </c:forEach>


</body>
</html>

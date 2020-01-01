<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/11
  Time: 22:51
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
        <td>更新操作</td>
        <td>删除操作</td>
    </tr>

    <c:forEach var="userlist" items="${requestScope.userList}">
        <tr>
            <td>${userlist.id}</td>
            <td>${userlist.username}</td>
            <td>${userlist.password}</td>
            <td><a href="updateInput.jsp">更新</a></td>
            <td><a href="deleteUser.jsp?userId=" + user.getId()>删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

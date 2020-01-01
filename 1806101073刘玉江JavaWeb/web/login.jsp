<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/12
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="">
    <input name="username" placeholder="用户名">
    <input name="password" placeholder="密码">
    <input type="submit" value="登录">
</form>
<form method="post" action="register.jsp">
    <input type="submit" value="注册">
    
</form>
<c:if test="${sessionScope.username!=null}">
    <jsp:forward page="userLlist.jsp"></jsp:forward>

</c:if>

</body>
</html>

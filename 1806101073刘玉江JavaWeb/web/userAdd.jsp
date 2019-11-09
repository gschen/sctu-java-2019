<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/7
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="savaUser.jsp" method="post">
    ID:<input type="text" name="id" placeholder="ID">
    用户名：<input type="text" name = "username" placeholder="用户名">
    密码：<input type="password" name = password placeholder="密码">
    <input type="submit" value="保存">
</form>
<a href="userLlist.jsp"> 返回列表</a>
</body>
</html>

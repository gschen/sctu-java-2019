<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/26
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int num = 12;
%>

该数字的平方和是：<%= num* num %>

<form action="handler4.jsp" method="post">
    <input type="hidden" name="num" value="<%= num%>"/>
    <input type="submit" value="计算立方和">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 11:43
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
数字的平方和是：<%= num * num%>

<form method="post" action="handler4.jsp">
    <input type="hidden" name="num" value="<%= num%>">
    <input type="submit" value="提交">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int num =12;



%>
该数字的平方和：<%= num*num%>
<form method="post" action="hander4.jsp">
    <input type="hidden" name="num" value="<%=num%>">
    <input type="submit" value="计算立方和">
</form>

</body>
</html>

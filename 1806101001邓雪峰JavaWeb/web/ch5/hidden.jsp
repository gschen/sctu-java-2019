<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
int num= 12;
%>
该数字的平方和为：<%=  num *num %>

<form method="post" action="handler4.jsp">
    <input name="num" type="hidden" value="<%=num%>"/>
    <input type="submit" value="提交">
</form>
</body>
</html>

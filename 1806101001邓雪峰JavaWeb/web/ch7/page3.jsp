<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this is page3.

<%
    response.sendRedirect("page4.jsp");
    response.sendRedirect("http://www.baidu.com");
%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/19
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
This is page 3

<%
    response.sendRedirect("/demo/ch7/page4.jsp");
    /*response.sendRedirect("http://www.so.com");*/

%>
</body>
</html>

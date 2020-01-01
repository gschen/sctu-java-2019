<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:include page="header.jsp">
    <jsp:param name="username" value="李四"></jsp:param>
</jsp:include>
这是页面6
</body>
</html>

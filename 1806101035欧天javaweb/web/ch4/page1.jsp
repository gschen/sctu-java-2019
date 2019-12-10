<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("user","张三");

%>

${sessionScope.user}
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>这是页面6
<jsp:include page="page2.jsp">
    <jsp:param name="username" value="lisi"/>
</jsp:include>
</body>
</html>

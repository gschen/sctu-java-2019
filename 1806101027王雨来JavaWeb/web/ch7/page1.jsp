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
This is page 1
<jsp:forward page="page2.jsp">
    <jsp:param name="address" value="niub"></jsp:param>
</jsp:forward>
</body>
</html>

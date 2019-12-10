<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String gender = request.getParameter("gender");
%>
您的性别是：
<%
    out.write(gender);
%>

</body>
</html>

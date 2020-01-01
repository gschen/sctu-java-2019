<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/26
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("user","zhangsan");
%>
${sessionScope.user}

</body>
</html>

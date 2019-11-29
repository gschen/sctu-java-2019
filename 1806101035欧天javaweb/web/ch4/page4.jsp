<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是页面4

<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:include page="footer.jsp">
    <jsp:param name="zipcode" value="装着"/>
</jsp:include>
</body>
</html>
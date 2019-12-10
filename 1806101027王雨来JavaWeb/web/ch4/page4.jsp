<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>这个是使用jsp动作标签来实现</h2>
<jsp:include page="footer.jsp">
    <jsp:param name="zipcode" value="610101"></jsp:param>
</jsp:include>
<%--因为前几个做不了这个--%>
</body>
</html>

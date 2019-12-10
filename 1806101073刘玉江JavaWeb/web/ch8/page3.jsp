<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
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
<p>这是page3</p>
<jsp:include page="footer.jsp">
    <jsp:param name="zipcode" value="6102222"/>
</jsp:include>
</body>
</html>

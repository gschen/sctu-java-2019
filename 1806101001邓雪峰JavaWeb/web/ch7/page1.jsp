<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
this is page1.
<jsp:forward page="/ch7/page2.jsp"><jsp:param name=" address" value="sctu"/></jsp:forward>

</body>
</html>

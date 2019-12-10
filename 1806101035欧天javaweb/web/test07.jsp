<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/5
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


<%  String name=(String) request.getAttribute("name");
    out.write("hello"+name);
%>

<h1>hello,<%= name%></h1>




<h2>gender:${sessionScope.gender}</h2>

<h2>app:${applicationScope.app}</h2>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/1
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="GB2312">
</head>
<body>
<%--    <h1>good</h1>--%>
<%--<%--%>
<%--    String name = (String) request.getAttribute("name");--%>

<%--    //out.write("hello"+name);--%>

<%--%>--%>
<%--<h1>hello,<%=name%></h1>--%>
<%
    pageContext.setAttribute("a","123123");
%>
<h1>name,${requestScope.name}</h1>
<h1>age,${requestScope.age}</h1>

<h2>gender:${sessionScope.gender}</h2>
<h2>application:${applicationScope.app}</h2>
<h2>page:${pageScope.a}</h2>

<%
    String a="a";
%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/15
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("aa",11);

    application.setAttribute("aa",22);

    session.setAttribute("aa",33);

    request.setAttribute("aa",44);
%>
<h1>aa==${pageScope.aa}</h1>
<h1>aa==${aa}</h1>



</body>
</html>

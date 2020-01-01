<%--
  Created by IntelliJ IDEA.
  User: Lenovo
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

    request.setAttribute("aa",22);

    session.setAttribute("aa",33);

    application.setAttribute("aa",44);

%>

<h1>${pageScope.aa} </h1>

<h1>${aa}</h1>

</body>
</html>

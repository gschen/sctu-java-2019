<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    request.setCharacterEncoding("utf-8");
    String zipcode = request.getParameter("zipcode");
%>



<hr>
<h1>梦想的旅途我背井离乡，肩上扛着行囊，<%= zipcode%>对未来的梦想。</h1>

</body>
</html>

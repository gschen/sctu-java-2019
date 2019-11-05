<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/5
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("age",18);

    List<String> nameList = new ArrayList<>();
    nameList.add("Bob");
    nameList.add("Alice");
    nameList.add("Justin");
    session.setAttribute("names",nameList);


%>
<table>
    <tr>
        <td>姓名</td>
    </tr>
    <%
        for (String name:nameList){
        out.write("<tr><td>"+name+"</td></tr>");
        }
    %>

    <c:forEach var="name" items="${sessionScope.names}">
        <tr><td>${name}</td></tr>
    </c:forEach>
</table>


</body>
</html>

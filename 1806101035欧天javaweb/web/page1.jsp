<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/5
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
session.setAttribute("age",18);
List<String> namelist=new ArrayList<>();
namelist.add("Bob");
namelist.add("Alice");
namelist.add("James");
namelist.add("Harden");
session.setAttribute("names",namelist);
%>

<table>
    <tr><td>姓名</td></tr>
    <%  for(String name :namelist){
        out.write("<tr><td>"+name+"</td></tr>");
    }  %>
    <c:forEach var="name" items="${sessionScope.names}">
        <tr><td>${name}</td></tr>
    </c:forEach>
</table>
<c:out value="${sessionScope.age}"/>

</body>
</html>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/5
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("age",18);
    List<String> nameList = new ArrayList<>();
    nameList.add("Bob");
    nameList.add("Jack");
    nameList.add("Mali");

    session.setAttribute("names",nameList);

    //for (String name : nameList){
        //out.write("<tr><td>"+name+"</tr></td>");
%>

<c:out value="${sessionScope.age}"/>

<table>
    <tr><td>姓名</td></tr>

    <%
        for (String name :nameList){
    out.write("<tr><td>"+name+"</tr></td>");}
    %>
    <c:forEach var="name" items="${sessionScope.names}">
        <tr><td>${name}</td></tr>
    </c:forEach>
</table>

</body>
</html>
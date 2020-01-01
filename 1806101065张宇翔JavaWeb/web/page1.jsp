<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zyx99
  Date: 2019/11/5
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("age",18);

    List<String> namesList = new ArrayList<>();
    namesList.add("bob");
    namesList.add("tob");
    namesList.add("aob");

    session.setAttribute("names",namesList);
%>
<table>
    <tr><td>xingming</td></tr>
    <%
            for (String name : namesList){
                out.write("<tr><td>"+name+"</td></tr>");
             }
%>

    <c:forEach var="name" items="${sessionScope.names}">
    <tr><td>${name}</td></tr>
    </c:forEach>



<c:out value="${sessionScope.age}"/>

</body>
</html>

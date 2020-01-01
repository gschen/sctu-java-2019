<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/11/5
  Time: 10:42
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
    session.setAttribute("sge",18);
    List<String> nameList = new ArrayList<>();
    nameList.add("fdvf");
    nameList.add("fddesc");
    nameList.add("fdcsdcavf");
    nameList.add("fdvcdaf");
    nameList.add("fdasdceqwvf");

    session.setAttribute("names",nameList);
   /* for (String name :nameList){
        out.write("<tr><td>"+name+"</td></tr>");
    }*/

%>
<table>
    <tr>
        <td>姓名</td>
        <%
            for (String name :nameList){
                out.write("<tr><td>"+name+"</td></tr>");
            }
        %>
        <c:forEach var="name" items="${sessionScope.names}">
            <tr>
    <td>
        ${name}
    </td>
</tr>
        </c:forEach>
    </tr>
</table>

<c:out value="${sessionScope.age}"/>
</body>
</html>

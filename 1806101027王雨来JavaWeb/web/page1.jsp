<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/5
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%--jsp的指令，include包含,page,taglib--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--prefix前缀--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%
    session.setAttribute("age",18);
    List<String> nameList = new ArrayList<>();
    nameList.add("Bob");
    nameList.add("Alice");
    nameList.add("Justin");
    session.setAttribute("names",nameList);


%>--%>
<%--<c:out value="${sessionScope.age}"/>自闭合的标签---c:前缀，out：标签名字，value：输出一个变量的值--%>
<table>
    <tr>
        <td>姓名</td>
        <%--<%
            for (String name : nameList){
                out.write("<tr><td>"+name+"</td></tr>");
            }
        %>--%>
        <c:forEach var="userlist" items="${requestScope.userList}">
        <tr>
            <td>${userlist.id}</td>
            <td>${userlist.username}</td>
            <td>${userlist.password}</td>
        </tr>
        </c:forEach>
    </tr>
</table>
</body>
</html>

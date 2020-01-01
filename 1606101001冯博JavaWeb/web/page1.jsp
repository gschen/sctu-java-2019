<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sun.jmx.snmp.SnmpUnknownAccContrModelException" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="edu.sctu.UserDao" %>
<%@ page import="edu.sctu.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/5
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>Title</title>
</head>
<body>

<%
    session.setAttribute("age",18);
    List<String> nameList = new ArrayList<>();
    nameList.add("fb");
    nameList.add("lx");
    nameList.add("gj");
    session.setAttribute("names",nameList);
/*    List<String> stuList = new ArrayList<>();
    stuList.add("wl");
    stuList.add("wt");
    stuList.add("xx");
    stuList.add("lx");
    session.setAttribute("stus",stuList);*/
    UserDao userDao = new UserDaoImpl();
    List<User> userList = new ArrayList<>();
    session.setAttribute("user",userList);
%>
<table>

    <tr><td>姓名</td></tr>
    <%
        for (String name : nameList){
            out.write("<tr><td>"+ name +"</td></tr>");
        }
    %>
    <c:forEach var="name" items="${sessionScope.names}"><%--items里放El表达式--%>
        <tr><td>${name}</td></tr>
    </c:forEach>
    <%--<c:forEach var="girl" items="${sessionScope.stus}">
        <tr><td>${stus}</td></tr>
    </c:forEach>--%>
    <c:forEach var="user" items="${sessionScope.user}">
        <tr><td>${user.usename}</td>+<td>${user.password}</td>+<td>user.id</td></tr>
    </c:forEach>
</table>

<c:out value="${sessionScope.age}" /><%--通过指令标签输出value里面的值--%>

<%--
page 只在一个页面范围起作用
request  一次请求范围内起作用
session  整个session空间都起作用，面向单个用户
application
--%>


</body>
</html>

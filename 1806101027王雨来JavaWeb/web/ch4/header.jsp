<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
%>
欢迎您，<%=username%>!

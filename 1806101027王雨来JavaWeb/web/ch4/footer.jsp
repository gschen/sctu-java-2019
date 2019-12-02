<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %><%--忽略EL表达式--%>
<hr/>
<%
    String zipcode = request.getParameter("zipcode");
%>
<p style="color: yellowgreen">版权所有，仿冒必究|邮编：<%= zipcode%></p>

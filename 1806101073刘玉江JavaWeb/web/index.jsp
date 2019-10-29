<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/22
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>hello jsp</title>
  </head>
  <body>
  这是一个jsp文件。
  <%
    out.write("hello+++");
    out.write("<h1>这是一个一级标签</h1>");
    out.print(request.getParameter(""));
  %>
  <table>
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>

  </table>
  <%
    out.write("hello");
    int day = 3;
  %>
<% for (int i = 0;i<=10;i++){%>
  <tr>
    <td>1</td>
    <td>liu</td>
    <td>19</td><br>
  </tr>
<%}%>
<% if (day == 1|day ==7){%>
  <p>今天是周末</p>

<%} else{ %>
  <p>今天是工作日</p>
<% }%>
<% for (int fontsize = 1;fontsize<=3;fontsize++){%>
  <font size = "<%= fontsize%>">实例 <br></font>
  <%}%>
  </body>
</html>

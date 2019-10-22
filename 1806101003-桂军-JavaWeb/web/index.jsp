<%@ page import="javax.xml.crypto.Data" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/22
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  这是一个jsp文件
  <%
    out.write("helloword");
    out.write("2019.10.22");
    for (int i = 1; i <11 ; i++) {
      out.write("<tr>" +
              "        <td>"+i+1+"</td>" +
              "        <td>桂军</td>" +
              "        <td>20</td>" +
              "    </tr>");
    }
  %>

  <table id="i">
    <tr>
    <td>编号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>
    <tr>
      <td>1</td>
      <td>桂军</td>
      <td>20</td>
    </tr>
  </table>
  

  </body>
</html>

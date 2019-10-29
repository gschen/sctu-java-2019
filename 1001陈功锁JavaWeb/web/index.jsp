<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-10-22
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  这是一个JSP文件。

  <%
    out.write("hello,world!++++++");
    System.out.println("hello,world!------");


    // write是红色!
    out.write("<h1>这是一个一级标题。</h1>");


  %>


  <table>
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>
<%--向页面输出10个一样的tr--%>
    <tr>
      <td>1</td>
      <td>chen</td>
      <td>18</td>
    </tr>
  </table>


  </body>
</html>

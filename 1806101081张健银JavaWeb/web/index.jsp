<%--
  Created by IntelliJ IDEA.
  User: 彭彦乐
  Date: 2019/10/22
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  这是一个jsp
  <%out.write("helloword");%>
 <table>
    <%for (int i = 0; i < 10; i++) {
        //先删除1然后双引号然后两个加号然后里面放变量
        out.write("<tr><td>"+(i+1)+"</td><td>123</td><td>adasda</td></tr>");
    }%>
 </table>

  <table>
      <tr>
          <td>编号</td>
          <td>用户</td>
          <td>密码</td>
      </tr>
      <tr>
          <td>1</td>
          <td>张三</td>
          <td>123456</td>
      </tr>
  </table>

  </body>
</html>

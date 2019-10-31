<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" errorPage="" %>
<html>
<head>
    <title>用户欢迎页面</title>
</head>
<body>
<%
    String username=(String)session.getAttribute("username");
    String name=(String)session.getAttribute("name");
    String age=(String)session.getAttribute("age");
    String psw=(String)session.getAttribute("psw");
    String phone=(String)session.getAttribute("phone");
    String address=(String)session.getAttribute("address");
    String city=(String)session.getAttribute("city");
    out.println("欢迎："+name+"来到这里！");
%>
<table border="1" align="center">
    <caption>
        用户信息：
    </caption>
    <form action="xiugai.jsp" method="post">
        <tr>
            <td>id:</td>
            <td><input type="text" name="id" value=<%=username %> readonly="true"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="psw"value=<%=psw%> readonly="true"></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"value=<%=name%>></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"value=<%=age%>></td>
        </tr>
        <tr>
            <td>tel:</td>
            <td><input type="text" name="phone"value=<%=phone%>></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input type="text" name="address"value=<%=address%>></td>
        </tr>
        <tr>
            <td>城市:</td>
            <td><input type="text" name="city"value=<%=city%>></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改" onclick="window.location.href='xiugai.jsp';"></td>
            <td><input type="button" value="注销" onclick="window.location.href='zhuxiao.jsp';"></td>
        </tr>
        <tr>
            <td><input type="button" value="修改密码" onclick="window.location.href='changepsw.jsp';"></td>
        </tr>
    </form>
</table>
</body>
</html>


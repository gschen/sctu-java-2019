<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/27
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<h2>JDBC直接访问mysql数据库</h2>
<br><hr><br>
<table align="center">
    <tr align="center">
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    <%
        //DBhelper db=new DBhelper();
        String sql="select * from login";
        ResultSet rs=sqlbean.doQuery(sql);
        while(rs.next()){
    %>
    <tr>
        <td><%=rs.getString("id") %></td>
        <td><%=rs.getString("user") %></td>
        <td><%=rs.getString("password") %></td>
    </tr>
    <%
    %>
    <%
        out.print("数据库操作成功，恭喜你");
        sqlbean.close();
    %>
</table>

</body>
</html>

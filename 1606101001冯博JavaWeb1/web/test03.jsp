<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/10/22
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;


    String sql = "select * from t_users";
    Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
            "root",
            "fb199708");
    statement = connection.createStatement();
    statement.executeUpdate(sql);

    List<User> userList = new ArrayList<>();
    while(resultSet.next()){
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        User user = new User(id, username, password);
        userList.add(user);
    }
    resultSet.close();
    statement.close();
    connection.close();
%>
<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>1</td>
        <td>feng</td>
        <td>fb199708</td>
    </tr>
    <%
        for (int i = 0; i <10 ; i++) {
            out.write("<td>" + i + "</td>" + "<td>feng</td>" + "<td>fb199708</td>");
        }
    %>
</table>
</body>
</html>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zyx99
  Date: 2019/10/22
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  //从数据库中读取所有的用户数据 3+1
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;


    String sql = "select * from t_user";

    Class.forName("com.mysql.cj.jdbc.Driver");
    connection  = DriverManager.getConnection(
            "jdbc:mysql://47.104.80.155:3306/javaweb",
            "javaweb",
            "sctu123!@#"
    );
    statement = connection.createStatement();
    resultSet = statement.executeQuery(sql);

    while (resultSet.next()){
        int id = resultSet.getInt(1);
        String username = resultSet.getString(2);
        String password = resultSet.getString(3);

        User user = new User(id, uesrname, password);
        uesrList.add(user);

        System.out.println(id+username+password);
    }

    for (User user :userList){
        System.out.println(uesr.getId());
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

    <%
    for(int i = 0;i < 10 ; i++){
        out.write("<tr><td>"+(i+1)+"</td>><td>张山</td>><td>111111</td>></tr>");
    }
    %>
</table>

</body>
</html>

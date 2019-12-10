<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/10/22
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    //从数据库中读取所有用户数据 3+1
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String sql = "select * from t_users";

    Class.forName("com.mysql.cj.jdbc.Driver");

    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
            "root",
            "123456"
    );

    statement = connection.createStatement();

    resultSet = statement.executeQuery(sql);

    List<User> userList = new ArrayList<>();

    while (resultSet.next()){
        int id = resultSet.getInt(1);
        String username = resultSet.getString(2);
        String password = resultSet.getString(3);

        User user = new User(id,username,password);
        userList.add(user);
    }

    for (User user :userList){
        System.out.println(user.getId()+user.getUsername()+user.getPassword()
        );
    }

    resultSet.close();
    statement.close();
    connection.close();


%>
<a href="test_05.jsp">+</a>
<table border="3">
    <tr>
        <td width="60px">编号</td>
        <td width="100px">用户名</td>
        <td>密码</td>
        <td>删除操作</td>
    </tr>

    <%
        /*for (int i = 0; i < 10; i++) {
            out.write("<tr><td>" + ( i + 1 )+"</td><td>李四狗</td><td>123456</td></tr>");

        }*/

        for(User user:userList){
            out.write("<tr><td>" + user.getId()+"</td><td>"+user.getUsername()
                    +"</td><td>u"+user.getPassword()+"</td><td><a href='deleteUser.jsp?userId="+user.getId()+"'>删除</a></td></tr>");
        }
    %>
</table>

</body>
</html>

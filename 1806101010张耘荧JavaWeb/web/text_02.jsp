<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 张耘荧
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
//从数据库中读取所有的用户3+1
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    String sql = "select * from t_users";
    Class.forName("com.mysql.cj.jdbc.Driver");

    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019? serverTimezone=UTC",
            "root",
            "123456"
    );
    //2.statement
    statement=connection.createStatement();

    //3.resultset
    resultSet=statement.executeQuery(sql);

    List<User> userlist=new ArrayList<>();


    while (resultSet.next()){
        int id = resultSet.getInt(1);
        String username=resultSet.getString(2);
        String password = resultSet.getString(3);

        User user=new User(id,username,password);
        userlist.add(user);

        //System.out.println(id+username+password);

        }

    resultSet.close();
    statement.close();
    connection.close();
%>
<table>
    <tr>
        <td>编号</td>
        <td>名字</td>
        <td>密码</td>
    </tr>
    <tr>
        <%--ctlr+d复制一行--%>
        <td>1</td>
        <td>张三</td>
        <td>123</td>
    </tr>
<%
    for (User user:userlist){


        //先删除1，然后两个双引号，两个加号
        out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");


    }
%>
</table>

</body>
</html>

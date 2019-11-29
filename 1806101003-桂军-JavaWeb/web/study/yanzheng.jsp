<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>用户身份验证</title>
</head>
<body>
<%
    try{
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //装载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                "root",
                "980925"); //写你自己的账号和密码
        //建立Statement
        Statement stmt=conn.createStatement();
        //执行查询建立ResultSet
        ResultSet rs=stmt.executeQuery("select * from myuser");
        if(username==null) username="";
        if(password==null) password="";
        String flag="111";
        while(rs!=null && rs.next())
        {
            if(username.equals(rs.getString("id")) && password.equals(rs.getString("psw")))
            {
                session.setAttribute("username",rs.getString("id"));
                session.setAttribute("age",rs.getString("age"));
                session.setAttribute("psw",rs.getString("psw"));
                session.setAttribute("name",rs.getString("name"));
                session.setAttribute("phone",rs.getString("phone"));
                session.setAttribute("address",rs.getString("address"));
                session.setAttribute("city",rs.getString("city"));
                response.sendRedirect("xianshi.jsp");
                flag="222";
                break;
            }
        }
        if(flag!="222")
            response.sendRedirect("login.jsp");

        //关闭连接、释放资源
        rs.close();
        stmt.close();
        conn.close();
    }catch(ClassNotFoundException cnfe){
        out.print(cnfe);
    }catch(SQLException sqle){
        out.print(sqle);
    }catch(Exception e){
        out.print(e);
    }
%>
</body>
</html>


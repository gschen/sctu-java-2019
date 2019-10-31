<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>修改数据</title>
</head>
<body>
<%
    try{
        String username=request.getParameter("name");
        String id=request.getParameter("id");
        String phone=request.getParameter("phone");
        String psw=request.getParameter("psw");
        int age=Integer.parseInt(request.getParameter("age"));
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        //装载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                "root",
                "980925"); //写你自己的账号和密码
        //建立statement
        Statement stmt=conn.createStatement();
        //执行update
        String sql1="update myuser set address='"+address+"'where id='"+id+"'";
        stmt.executeUpdate(sql1);
        String sql2="update myuser set phone='"+phone+"'where id='"+id+"'";
        stmt.executeUpdate(sql2);
        String sql3="update myuser set age='"+age+"'where id='"+id+"'";
        stmt.executeUpdate(sql3);
        String sql4="update myuser set city='"+city+"'where id='"+id+"'";
        stmt.executeUpdate(sql4);
        String sql5="update myuser set name='"+username+"'where id='"+id+"'";
        stmt.executeUpdate(sql5);
        session.invalidate();
        response.sendRedirect("login.jsp");
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


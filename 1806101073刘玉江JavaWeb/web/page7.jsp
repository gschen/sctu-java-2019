<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/15
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //9个对象不需要实例化可以直接操作
    // JSP内置对象(9个内置对象):
//    1.PageContext javax.servlet.jsp.PageContext JSP的页面容器
//    2.request javax.servlet.http.HttpServletrequest 获取用户的请求信息
//    3.response javax.servlet.http.HttpServletResponse 服务器向客户端的回应信息
//    4.session javax.servlet.http.HttpSession 用来保存每一个用户的信息
//    5.application javax.servlet.ServletContext 表示所有用户的共享信息
//    6.config javax.servlet.ServletConfig 服务器配置信息，可以取得初始化参数
//    7.out javax.servlet.jsp.jspWriter 页面输出
//    8.page java.lang.object)
//    9.exception java.lang.Throwable
pageContext.setAttribute("aa",11);
request.setAttribute("aa",22);
session.setAttribute("aa",33);
application.setAttribute("aa",44);
%>
<h1>aa = ${pageScope.aa}</h1>
<h1>aa = ${applicationScope.aa}</h1>

</body>
</html>

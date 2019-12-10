<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/26
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>购物车列表</title>
</head>
<body>
<%

    if (session.getAttribute("ItemList") == null){
        out.write("购物车为空");
    }
    else {
        List<String> list = (List<String>) session.getAttribute("ItemList");
        for (String item : list){
            out.write(item+"</br>");
        }
    }


%>

<a href="cart1.jsp">添加购物车</a>

</body>
</html>

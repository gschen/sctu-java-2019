<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/26
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String item = request.getParameter("item");
    if (session.getAttribute("ItemList") == null){
        List<String> itemList = new ArrayList<>();
        itemList.add(item);
        session.setAttribute("ItemList",itemList);
    }else {
        List<String> itemList = (List<String>) session.getAttribute("ItemList");
        itemList.add(item);
        session.setAttribute("ItemList",itemList);
    }
%>
<a href="cartList.jsp">添加成功，查看购物车</a>
</body>
</html>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
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
    request.setCharacterEncoding("utf-8");
    String item = request.getParameter("item");
    if (session.getAttribute("ItemList")==null){
        List<String> itemList = new ArrayList<String>();
        itemList.add(item);
        session.setAttribute("ItemList",itemList);
    }else{
        List<String> itemList = (List<String>) session.getAttribute("ItemList");
        itemList.add(item);
        session.setAttribute("ItemList",itemList);
    }
    out.write("添加商品成功！");
%>
</body>
</html>

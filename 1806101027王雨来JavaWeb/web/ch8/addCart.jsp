<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 85007
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
    //
    if(session.getAttribute("ItemList") == null){
        List<String> itemList = new ArrayList<String>();
        itemList.add(item);

        session.setAttribute("ItemList",itemList);
    }else {
        List<String> itemLIst = (List<String>) session.getAttribute("ItemList");
        itemLIst.add(item);
        session.setAttribute("ItemList",itemLIst);
    }
    out.write("添加到购物车成功！");
%>
</body>
</html>

<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/12/10
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="chatHandler.jsp" method="post">
    <input type="text" name="content" /> <input type="submit" value="发送" />

</form>

<hr/>
<h1>聊天内容</h1>

<%

    if (session.getAttribute("account") == null){
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }

    if (application.getAttribute("chatList") == null){

        out.write("当前还没有人发言");

    }else {

        List<String> chatList = (List<String>) application.getAttribute("chatList");

        for (String line : chatList){
            out.write(line + "<br />");
        }
    }
    response.setHeader("Refresh","5");
%>

</body>
</html>

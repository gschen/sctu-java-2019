<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.setCharacterEncoding("utf-8");

    String content = request.getParameter("content");

    //处理聊天内容
    String account = (String) session.getAttribute("account");

    String line = account + " : " + content;

    List<String> chatList = null;
    //整个聊天室第一个人说的第一句话
    if (application.getAttribute("chatList") == null){
         chatList = new ArrayList<String>();

        chatList.add(line);


    }else {
         chatList = (List<String>) application.getAttribute("chatList");

        chatList.add(line);
    }
    application.setAttribute("chatList",chatList);




//    request.getRequestDispatcher("chatroom.jsp").forward(request,response);

    response.sendRedirect("chatroom.jsp");

%>
<%@ page import="com.mysql.cj.api.Session" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    request.setCharacterEncoding("UTF-8");
    //接受用户输入的账号和密码
    String account = request.getParameter("account");
    String password = request.getParameter("password");

    //检查账号和密码是否匹配
    session.setAttribute("account",account);

    //跳转到聊天室界面
    //request.getRequestDispatcher("chatroom.jsp").forward(request,response);

    response.sendRedirect("chatroom.jsp");



%>

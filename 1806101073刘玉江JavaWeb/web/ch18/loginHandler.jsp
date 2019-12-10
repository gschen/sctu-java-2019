<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    //接收用户输入的账号和密码
    request.setCharacterEncoding("utf-8");
    String account = request.getParameter("account");
    session.setAttribute("account",account);
    String password = request.getParameter("password");

    //检查账号和密码是否匹配

    session.setAttribute("account",account);

    //跳转到聊天室主要界面
//    request.getRequestDispatcher("chatroom.jsp").forward(request,response);
    response.sendRedirect("chatroom.jsp");
    //



%>
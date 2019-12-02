<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/29
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int inputCode = Integer.parseInt(request.getParameter("code"));

    int randCode = (int) session.getAttribute("randCode");

    if(inputCode == randCode){
        //匹配
        request.setAttribute("msg","验证码匹配！");
    } else {
        request.setAttribute("msg","验证码不匹配！");
    }
    request.getRequestDispatcher("loginForm.jsp").forward(request,response);
%>
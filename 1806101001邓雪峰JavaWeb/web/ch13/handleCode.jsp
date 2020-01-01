<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int inputcode = Integer.parseInt(request.getParameter("code"));

    int randCode = (int) session.getAttribute("randCode");
    if (inputcode == randCode){
    //匹配
    request.setAttribute("msg","验证码匹配");
    }else {

        //不匹配
        request.setAttribute("msg","验证码不匹配");
    }
    request.getRequestDispatcher("loginForm.jsp").forward(request,response);
%>





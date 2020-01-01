<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String tno = request.getParameter("tno");

    List<Teacher> teacherList = (List<Teacher>) application.getAttribute("teacherList");


   for (Teacher teacher : teacherList){
        if (teacher.getTno().equals(tno)){

            teacher.setVoteNum(teacher.getVoteNum()+1);
        }
    }
    application.setAttribute("teacherList",teacherList);
    request.getRequestDispatcher("index.jsp").forward(request,response);
%>
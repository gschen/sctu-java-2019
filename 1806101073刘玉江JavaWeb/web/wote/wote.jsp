<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String tNo = request.getParameter("tNO");
    List<Teacher> teacherList = (List<Teacher>) application.getAttribute("teacherList");
    for (Teacher teacher : teacherList) {
        if (teacher.gettNo().equals(tNo)) {
            teacher.setVoteNum(teacher.getVoteNum() + 1);
        }
    }
    application.setAttribute("teacherList", teacherList);
    request.getRequestDispatcher("index.jsp").forward(request,response);
%>
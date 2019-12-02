package edu.sctu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //session空间定义一个变量
        HttpSession session = req.getSession();
        session.setAttribute("username","WangYuLai");

        resp.getWriter().write("login Servlet");
    }
}

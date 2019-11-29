package edu.sctu.servlet;

import edu.sctu.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<h1>hello,world!</h1>");
        req.setAttribute("name","张三");

        User user= new User("guijun","971214");
        req.setAttribute("user",user);

        HttpSession session = req.getSession();
        session.setAttribute("gender","male");

        ServletContext application =req.getSession().getServletContext();
        application.setAttribute("app","1231456489");








        req.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        req.getRequestDispatcher("test07.jsp").forward(req,resp);

    }

}

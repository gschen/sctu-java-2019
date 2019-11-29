package edu.sctu.model.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

public class Test01Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer =resp.getWriter();
        resp.getWriter().write("<h1>hello.world!</h1>");


        req.setAttribute("q","q");

        req.getRequestDispatcher("test07.jsp").forward(req,resp);

        HttpSession session = req.getSession();
        session.setAttribute("gender","male");

    }

}


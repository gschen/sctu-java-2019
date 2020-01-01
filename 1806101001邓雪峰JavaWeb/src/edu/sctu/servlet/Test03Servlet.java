package edu.sctu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test03Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("this is a servlet03");

        String aa = (String) req.getAttribute("aa");
        System.out.print("aa");
        req.getRequestDispatcher("/Test09.jsp").forward(req,resp);
    }
}

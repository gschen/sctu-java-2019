package edu.sctu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;

public class Test02Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("aa",111111);

        System.out.println("this is servlet02\uE0A3 \uE0A3");

        req.getRequestDispatcher("/test3").forward(req,resp);
    }
}

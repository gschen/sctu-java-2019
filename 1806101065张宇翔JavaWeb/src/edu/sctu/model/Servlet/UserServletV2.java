//package edu.sctu.model.Servlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class UserServletV2 extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        System.out.println("this is servlet!");
//        UserDao userDao=new UserDaoImpl();
//
//        List<User> userList=userDao.selectAll();
//
//        req.setAttribute("userList","userList");
//        //跳转
//        req.getRequestDispatcher("/text_06.jsp").forward(req,resp);
//
//    }
//}






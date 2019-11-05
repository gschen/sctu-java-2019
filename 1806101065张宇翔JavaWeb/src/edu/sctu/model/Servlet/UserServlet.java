//
package edu.sctu.model.Servlet;
//
//import edu.sctu.model.User;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.Writer;
//import java.util.List;
//
//public class UserServlet extends HttpServlet{
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        UserDao userDao = new UserDaoImpl();
//        List<User> userList = userDao.selectAll();
//
//        Writer writer = resp.getWriter();
//
//        Writer.writer("<table>");
//
//        for (User user : userList) {
//            resp.getWriter().write("");
//        }
//        Writer.writer("</table>");
//    }
//}
//之前的文件未起作用
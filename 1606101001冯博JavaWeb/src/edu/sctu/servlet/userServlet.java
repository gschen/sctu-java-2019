package edu.sctu.servlet;
import edu.sctu.UserDao;
import edu.sctu.UserDaoImpl;
import edu.sctu.model.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

public class userServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.从数据库里面查出所有用户数据
        UserDao userDao = new UserDaoImpl();
        List<User> userList = null;
        try {
            userList = userDao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Writer writer = resp.getWriter();
        writer.write("<table>");
        //2.向页面输出信息
        for(User user : userList){
            writer.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+ user.getPassword()+"</td>");
        }
        writer.write("<table>");

    }
}

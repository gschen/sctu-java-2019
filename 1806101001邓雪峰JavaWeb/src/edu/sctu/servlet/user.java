package edu.sctu.servlet;

import edu.sctu.model.User;
import edu.sctu.model.UserDao;
import edu.sctu.model.UserDaoimpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

public class user extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //从数据库里面查出所有数据
        UserDao userDao =new UserDaoimpl();
        List<User> userList = null;
        try {
            userList = userDao.selectAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Writer writer = resp.getWriter();
        writer.write("<table>");

        //向页面输出信息
        for (User user : userList){
            writer.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td><td>删除</td></tr>");
        }

        writer.write("</table>");


    }

    private abstract class UserDaoImpl implements UserDao {
    }
}

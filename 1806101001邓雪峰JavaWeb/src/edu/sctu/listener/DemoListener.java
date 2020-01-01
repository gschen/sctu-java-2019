package edu.sctu.listener;

import edu.sctu.model.User;
import edu.sctu.model.UserDao;
import edu.sctu.model.UserDaoimpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;
import java.util.List;

public class DemoListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //事件
        System.out.print("初始化成功");

        UserDao userDao = new UserDaoimpl();
        List<User> userList = null;
        try {
            userList = userDao.selectAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sce.getServletContext().setAttribute("userList",userList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.print("网站关闭");
    }
}

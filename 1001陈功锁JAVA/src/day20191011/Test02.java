package day20191011;

import java.sql.*;

public class Test02 {

    public static void main(String[] args) {


        //3+1

        // 3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // 1
        String sql = "insert into t_users(username, password) values ('zhangsan', '123456')";


        try {
            // 0. 加载数据库驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019", // 数据库连接字符串
                    "root",
                    "sctu123456" //写你自己的账号和密码

                    // 远程服务器信息
//              "jdbc:mysql://47.104.80.155:3306/javaweb", // 数据库连接字符串
//              "javaweb",
//              "sctu123!@#",
            );

            // 2. statement
            statement = connection.createStatement();

            // 3. resultSet
            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}

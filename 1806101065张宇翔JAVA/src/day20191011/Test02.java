package day20191011;

import java.sql.*;

public class Test02 {
    public static void main(String[] args) throws SQLException {
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "insert into t_users(username,password) values('lishi', '123456')";

        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://47.104.80.155:3306/javaweb",
                    "javaweb",
                    "sctu123!@#"


            );
            statement = connection.createStatement();

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


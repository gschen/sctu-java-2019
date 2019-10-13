package src.day20191011;

import java.sql.*;

public class Test03 {
    public static void main(String[] args) {
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "DELETE FROM t_users WHERE id = 9";

        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写你自己的账号和密码
            );
            //2.statement
            statement = connection.createStatement();
            //3.update
            statement.executeUpdate(sql);
            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {

                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
    }
}

package lab_03.Test_011;

import java.sql.*;

public class Test_011 {
    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;


        String sql = "insert into t_users(username,password,register_datetime) values ('admin','admin',192312312123)";
        String sql1 =" insert into t_users(username,password,register_datetime) values('chen','123456',123123213123)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",//数据库连接字符串
                    "root",
                    "1419512991"
            );

            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);



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

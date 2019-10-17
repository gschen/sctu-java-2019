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
        String sql = "insert into t_user(user, password) value ('zhangsan', '123456')";


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // 1. connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2018?serverTimezone=UTC",
                    "root",
                    "123456"

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
                e.printStackTrace();
            }
        }
    }
}

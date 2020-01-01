package src.lab_03.Test_13;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "update t_students set department = '改了' where id = 3";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "1914571065lyj"
            );
            statement = connection.createStatement();

            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

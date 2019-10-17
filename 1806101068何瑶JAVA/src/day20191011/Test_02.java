package day20191011;

import java.sql.*;

public class Test_02 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_users";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://47.104.80.155/javaweb?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "sctu123!@#");
            statement = connection.createStatement();

            // 3. resultSet
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                System.out.println(id + " - " + username + " - " + password);

            }
            } catch(ClassNotFoundException e){
                e.printStackTrace();
            } catch(SQLException e){
                e.printStackTrace();
            } finally {
            try {
            statement.close();
            connection.close();
            resultSet.close();
            } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }
}

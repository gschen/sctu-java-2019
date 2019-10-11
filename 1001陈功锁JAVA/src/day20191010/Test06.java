package day20191010;

import java.sql.*;

public class Test06 {

    public static void main(String[] args) {

        // 3+1
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_users";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "sctu123456"
            );

            statement = conn.createStatement();

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){

                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                conn.close();
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

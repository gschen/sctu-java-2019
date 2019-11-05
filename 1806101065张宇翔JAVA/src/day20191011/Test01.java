package day20191011;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) throws SQLException {
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "select * from t_users";

        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://47.104.80.155:3306/javaweb",
                    "javaweb",
                    "sctu123!@#"


            );
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                System.out.println(id + " - " + username + " - " + password);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

package day20191011;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test04 {
    public static void main(String[] args) {

        //3+1
        //3

        Connection connection = null;
        Statement statement = null;

        //1
        String sql = "update t_users set username = 'lisi' where id = 2";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",//数据库连接字符串
                    "root",
                    "1419512991"
            );
            //2.sy=tatement
            statement = connection.createStatement();
            //3.reultSet
            statement.executeUpdate(sql);

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

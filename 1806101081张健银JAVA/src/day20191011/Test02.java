package day20191011;

import java.sql.*;

public class Test02 {
    public static void main(String[] args) {

        //3+1
        //3

        Connection connection = null;
        Statement statement = null;

        //1
        String sql = "insert into t_users(username,password) values ('zhangsan','123321')";
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

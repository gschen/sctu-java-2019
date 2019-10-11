package src.day20191011;

import java.sql.*;

public class Test02 {
    public static void main(String[] args) {
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "INSERT INTO t_users(username,password)VALUES('sad','123')";

        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写你自己的账号和密码
            );

            System.out.println();
            //2.statement
            statement = connection.createStatement();
            //3.update
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

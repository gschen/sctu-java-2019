package day20191011;

import java.sql.*;

public class Test02 {
    public static void main(String[] args) {
        //3+1
        //3
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        //1
        String sql="insert into t_users(username,password)value ('zhang','180')";//在t_users中插入数据


            //0.加载数据库驱动程序
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1.connection
            connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "932513952"   //自己的账号密码

            );
            //2.statement
            statement=connection.createStatement();
            //3.resultSet
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

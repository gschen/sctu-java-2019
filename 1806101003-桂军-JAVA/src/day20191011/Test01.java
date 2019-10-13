package day20191011;

import java.sql.*;

public class Test01 {

    public static void main(String[] args) {
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1X
        String sql = "select * from t_users";//查询数据
        //  加载数据库驱动程序

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1.connection
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                        "root",
                        "980925"//写你自己的账号和密码
                );
                //2.statement
                statement = connection.createStatement();
                //3.resultset
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()){

                    String id = resultSet.getString("id");
                    String username = resultSet.getString("username");
                    String password = resultSet.getNString("password");
                    System.out.println(id+"-"+username+"-" +password);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {

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

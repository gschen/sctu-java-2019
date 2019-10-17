package day20191011;

import java.sql.*;

public class Test_02 {
    public static void main(String[] args) throws SQLException {
        //3+1 :三个变量
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        //1
        String sql= "DELETE FROM t_users WHERE id=5";
        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            try {
                connection= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                        "root",
                        "601906@QJ"
                );
                //2.statement
                statement=connection.createStatement();
                statement.executeUpdate(sql);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

            statement.close();
            connection.close();
        }
    }
}
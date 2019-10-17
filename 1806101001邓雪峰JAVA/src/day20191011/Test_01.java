package day20191011;

import javax.xml.transform.Result;
import java.sql.*;

public class Test_01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        String sql = "select * from t_uers";

        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");

            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/javaweb",//数据库连接字符串
                        "root",
                        "123456"//写数据库用户名和密码
                );//47.10o4.88.155:3306/javaweb
//sctu123!@#
                statement = connection.createStatement();

                resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    String username = resultSet.getString(2);
                    String Password = resultSet.getString(3);


                    System.out.println(id+"-"+username+"-"+Password);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

            try { resultSet.close();
                statement.close() ;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

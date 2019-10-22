package lab_03.Test_12;

import java.sql.*;

public class Test_12_3 {
    public static void main(String[] args) {

        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "select * from t_userstest where username = 'admin' or password = '123456'";

        //0.加载数据库驱动程序——查
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //1.Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//"jdbc:mysql://47.104.80.155:3306/javaweb"
                    "root",
                    "dl921021"//写自己的数据库的账号密码
                    //远程服务器的账号密码
                    //"jdbc:mysql://47.104.80.155:3306/javaweb"
                    //"javaweb"
                    //"sctu123!@#"
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String register = resultSet.getString(4);
                System.out.println(id+"-"+username+"-"+password+"-"+register);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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

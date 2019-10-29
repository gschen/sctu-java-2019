package lab_03;

import java.sql.*;

public class Test_14 {
    public static void main(String[] args) {

        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String addsql = "insert into t_userinfo(usercode,username,password,email) values ('7107','李筱思','145236','xiaosi@qq.com')";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //1.Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//"jdbc:mysql://47.104.80.155:3306/javaweb"
                    "root",
                    "dl921021"//写自己的数据库的账号密码
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            statement.executeUpdate(addsql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //删除resultSet
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        String sql = "select * from t_userinfo";

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
                String usercode = resultSet.getString(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String email = resultSet.getString(4);
                System.out.println(usercode+"-"+username+"-"+password+"-"+email);
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

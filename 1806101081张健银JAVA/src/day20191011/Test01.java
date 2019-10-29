package day20191011;


import java.sql.*;

public class Test01 {
    public static void main(String[] args) {

        //3+1
        //3

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        //1
        String sql = "select * from t_users";
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
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){

                int id = resultSet.getInt(1);//获取第几列
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                System.out.println(id + "-" + username + "-" + password);
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

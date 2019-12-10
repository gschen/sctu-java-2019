package day20191011;



import java.sql.*;

public class Test_03 {

    //3+1

    //3
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String sql = "update t_users set password='iam1' where id = 1";

        try {
            //加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "123456"
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            statement.executeUpdate(sql);

            /*while (resultSet.next()){

                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                System.out.println(id + " - " + username + " - " + password);
            }*/

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


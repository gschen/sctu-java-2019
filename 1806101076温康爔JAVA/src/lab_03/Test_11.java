package lab_03;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Test_11 {
    public static void main(String[] args) {

        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1
        String addsql1 = "insert into t_userstest(username,password,register_datetime) values ('admin','admin','192312312123')";
        String addsql2 = "insert into t_userstest(username,password,register_datetime) values ('chen','123456','123123213123')";

        //0.加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //1.Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
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
            statement.executeUpdate(addsql1);
            statement.executeUpdate(addsql2);

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
    }
}

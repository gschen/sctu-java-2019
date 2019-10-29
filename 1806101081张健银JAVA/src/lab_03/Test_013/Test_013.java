package lab_03.Test_013;
//3)	向数据库中插入十条示例数据；
//        4)	打印学生表的所有学生信息。
//        5)	删除 id 为5的学生信息；
//        6)	查找 id 为3的学生并将其院系更改为“信息与工程学院

import java.sql.*;

public class Test_013 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_student";
        String sql1 = "delete from t_student where id=5";
        String sql2 = "select * from t_student where id=3";
        String sql3 = "update t_student set department='信息与工程学校院' where id=3";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",
                    "root",
                    "1419512991"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql3);
//            resultSet = statement.executeQuery(sql2);
//            while (resultSet.next()){
//                int id = resultSet.getInt(1);
//                String stu_no = resultSet.getString(2);
//                String real_name = resultSet.getString(3);
//                int age = resultSet.getInt(4);
//                int gender = resultSet.getInt(5);
//                String department = resultSet.getString(6);
//                System.out.println(id+"-"+stu_no+"-"+real_name+"-"+age+"-"+gender+"-"+department);
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
//                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

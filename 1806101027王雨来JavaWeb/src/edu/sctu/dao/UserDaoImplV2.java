package edu.sctu.dao;

import edu.sctu.model.User;
import edu.sctu.utils.DatabaseManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
//较新的版本
public class UserDaoImplV2 implements UserDao{

    //先实例化（进行三加一和链接数据库）
    private DatabaseManager databaseManager = new DatabaseManager();


    @Override
    public void saveUser(User user) {
        String sql = "insert into t_users(username,password) values('"+user.getUsername()
                +"','"+user.getPassword()+"')";
        Statement statement = databaseManager.open();

        try {
            statement.executeUpdate(sql);
        }catch (Exception e){

        }
        databaseManager.close();
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from t_users where id="+id+"";
        Statement statement = databaseManager.open();

        try {
            statement.executeUpdate(sql);
        }catch (Exception e){

        }
        databaseManager.close();
    }

    @Override
    public void updateUser(User user) {
        String sql = "update t_users set username='"+user.getUsername()+"' where id ="+user.getId()+"";

        Statement statement = databaseManager.open();

        try {
            statement.executeUpdate(sql);
        }catch (Exception e){

        }
        databaseManager.close();
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public String login(String username) {
        ResultSet resultSet = null;
        String sql = "select * from t_users where username="+username+"";

        Statement statement = databaseManager.open();

        try {
            statement.executeUpdate(sql);
        }catch (Exception e){

        }
        String password = null;
        try {
            assert false;
            password = resultSet.getString(3);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        databaseManager.close();

        return password;
    }
}

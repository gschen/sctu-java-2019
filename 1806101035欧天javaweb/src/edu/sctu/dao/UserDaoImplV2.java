package edu.sctu.dao;

import edu.sctu.model.User;
import edu.sctu.utils.DatabaseManager;

import java.sql.Statement;
import java.util.List;

public class UserDaoImplV2 implements UserDao {
    private DatabaseManager databaseManager =new DatabaseManager();
    @Override
    public void saveUser(User user){
        String sql="insert into t_users(username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";
        Statement statement= databaseManager.open();
        try {
            statement.executeUpdate(sql);
        }catch (Exception e){
        }
    }
    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> selectAll() {
        return null;
    }


}

package edu.sctu.model;

import edu.sctu.utils.DatabaseManager;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoImplv2 implements UserDao {
    private DatabaseManager databaseManager = new DatabaseManager();


    @Override
    public void saveUser(User user) {
        String sql = "insert into from t_users(id,age) values ";
        Statement statement = databaseManager.open();
        try{
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
    public List<User> selectAll() throws ClassNotFoundException, SQLException {
        return null;
    }
}

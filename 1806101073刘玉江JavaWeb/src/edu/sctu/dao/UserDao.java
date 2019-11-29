package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.SQLException;
import java.util.List;

//database access object
public interface UserDao {
    void saveUser(User user) throws SQLException;
    List<User> deleteById(String id) throws SQLException;
    void updateUser(String id,String username,String password);

    List<User> selectAll() ;
}

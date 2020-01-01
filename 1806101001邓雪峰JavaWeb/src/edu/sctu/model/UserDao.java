package edu.sctu.model;

import java.sql.SQLException;
import java.util.List;

public interface  UserDao {
     void saveUser(User user);
     void deleteById(int id );
     void updateUser(User user);
     List<User> selectAll() throws ClassNotFoundException, SQLException;



}

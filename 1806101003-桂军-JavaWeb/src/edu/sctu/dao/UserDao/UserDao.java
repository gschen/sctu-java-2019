package edu.sctu.dao.UserDao;

import edu.sctu.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);


    void deleteByid(int id);


    void updataUser(User user);


    List<User> selectAll();
}

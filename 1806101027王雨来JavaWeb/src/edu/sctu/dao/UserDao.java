package edu.sctu.dao;

import edu.sctu.model.User;

import java.util.List;
//这是一个接口，定义的是（保存一个用户、通过id来删除一个用户、更新用户、）
public interface UserDao {//interface
    void saveUser(User user);

    void deleteById(int id);

    void updateUser(User user);

    List<User> selectAll();

    String login(String username);
}

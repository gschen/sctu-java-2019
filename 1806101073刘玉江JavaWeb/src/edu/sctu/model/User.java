package edu.sctu.model;

public class User {
    private String id;
    private String username;
    private String password;

    //生成构造函数

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }



    //生成这三个属性的getter和setter。


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

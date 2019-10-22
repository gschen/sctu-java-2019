package edu_sctu_model;

public class User {
    private int id;
    private String username;
    private String password;

    public User(int id,String username,String password){
        this.id=id;
        this.password=password;
        this.username=username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}

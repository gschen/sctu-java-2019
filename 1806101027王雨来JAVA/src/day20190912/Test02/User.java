package lab_02.day20190912.Test02;

public class User {
    String name;
    int age;
    boolean sex;
    public User(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("构造函数");
    }
    public void study(){
        System.out.println("学习");
    }

}


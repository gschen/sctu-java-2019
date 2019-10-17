package day20190912;

public class User {
    //3.非常特殊的函数。--构造函数
    //1)函数名与类名一致
    //2)没有返回值
    User() {


    }
    //对成员变量初始化（付值）
    User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("这是一个构造函数！");
    }

    //姓名
    String name;
    //性别
    char sex;
    int age;
    //年龄
    //爱好
    String like;
    //住址
    String address;
    //城市
    String city;
    //学习
    String study;

    void sleep() {

    }

    void study(){}
}

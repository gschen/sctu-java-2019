package day20190912;

/**
 * Created by Administrator on 2019-9-12.
 */
public class User {// ctrl + h

    User(){

    }

    // 3. 非常特殊的函数。 -- 构造函数
    // 1) 函数的名字与类名一致；
    // 2) 函数没有返回值类型
    User(String name, int age){
        // 对成员变量进行赋值(初始化)
//        this.name = "chen";
//        this.age = 10;
        this.name = name;
        this.age = age;
        System.out.println("这是构造函数！");
    }

    // 1. 成员变量、属性
    // 姓名、年龄等
    String name; // ctrl + B
    int age;

    // 2. 成员方法、行为
    // 看电影、睡觉、学习等
    void sleep(){
        int a = 10;


//        this.age = 10;
//
//        this.study();
    }

    void study(){
        System.out.println("这是学习方法。");
    }



}

package day20190912;

import static java.lang.System.*;

public class User {
    public int age;
    //属性
     String name;
    User(String name,int age){
        this.name = name;
        this.age = age;
        out.println("这是一个构造函数");
    }
    /**
     *
     */;
    //方法
     void getName(){
        out.println("名字："+this.name);
    }
     void getAge(){
        out.println("性别："+this.age);
    }

}

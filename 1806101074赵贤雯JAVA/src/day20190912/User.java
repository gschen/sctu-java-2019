package day20190912;

public class User {
    User(){

    }

    // 一个特殊函数----构造函数
    // 1) 函数名字与类名一致
    // 2) 该函数没有返回值类型
    User(String name, int age,String gender,int statrue){
        // 对于成员变量进行赋值（初始化）
//        this.name = "赵";
//        this.age = 18;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.statrue = statrue;
        System.out.println("这是构造函数！");
    }

    // 1. 属性（成员变量）
    //  性别、肤色、国家、年龄段、身高
    String name;
    String gender;
    String color;
    String country;
    int age;
    int statrue;

 // 2. 行为（成员方法）
    // 吃饭、睡觉、学习、社交
    void sleep(){
        int a = 10;
        this.age = 10;
        this.study();
    }
    void study(){
        System.out.println("这是study函数");
    }
    public static void main(String[] args) {

    }

}

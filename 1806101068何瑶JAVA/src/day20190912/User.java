package day20190912;

public class User {
    User(){}
    //非常特殊的函数——构造函数
    //函数的名字与类的名字一致。函数没有返回值类型。
    User(String name,int age){
        //队成员变量进行赋值（初始化）
        this.name="he";
        this.age=10;
        System.out.println("这是构造函数");
    }
    //成员变量、属性
    //姓名、年龄等
    //行为
    //成员方法、学习、睡觉等
    String name;
    int age;
    void sleep(){
        int a=10;
        this.age=10;
    }
    void study(){
        System.out.println("这是学习方法");
    }
}

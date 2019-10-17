package day20190912;

public class User {
    User(){

    }
    //非常特殊的函数---构造函数
    //1.函数名字与类一致user
    //2.函数没有返回值类型
    User(String name,int age){//对成员变量赋值（初始化）
  //      this.age=10;
  //     this.name="zhao";
        this.age=age;
        this.name=name;
        System.out.println("这是构造函数");
    }

    //属性 成员变量
        int age;
        String name;

    //行为 成员方法
    void sleep(){
        System.out.println("hahahaha");//在成员变量中定义变量，局部变量

       this.age=10; //this.访问变量age


    }
}

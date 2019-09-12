package day0912;

public class User {

    //1.成员变量
    String name;
    String sex;
    int age;
    String address;


    //2.成员方法
    void userName(){
        System.out.println("小明");;
    }

    void study(){
        System.out.println("这是学习方法！");
    }

    //3，非常特殊的函数——构造函数
    //1） 函数名与类名一致
    //2）没有返回值类型
      User(String name){
          this.name=name;
          System.out.println(this.name);
      }



    public static void main(String[] args) {

    }
}

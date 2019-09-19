package day0912;

//Student和Run是一起的
public class Student {
    String name;
    int age;
    String number;


    Student(String name,int age,String number){
        //初始化
        this.name = name;
        this.age = age;
        this.number = number;
        System.out.println("姓名："+this.name+"\n" +"年龄："+this.age+"\n" +"学号："+this.number+"\n");
    }

}

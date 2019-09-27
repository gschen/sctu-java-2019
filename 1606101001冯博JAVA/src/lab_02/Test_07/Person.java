package lab_02.Test_07;

public class Person {
    String name;
    int age;
    String id;
    void printIn(String name,int age,String id){
        this.name = name;
        this.age = age;
        this.id = id;
        System.out.println("姓名为：" + this.name + "\n" + "年龄为：" + this.age + "\n" + "身份证号为：" +  this.id);
    }
}

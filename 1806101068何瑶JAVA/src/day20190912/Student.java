package day20190912;

public class Student {
    Student(String name,int age,char sex){
        this.name="yang";
        this.age=20;
        this.sex='男';
        System.out.println("杨洋"+" "+age+" "+sex);
    }
    //1.成员变量
    //姓名、性别、年龄等
    String name;
    char sex;
    int age;
    //2.成员方法
    //学习、看书、睡觉等
    void study(){
    }
    void sleep(){}
}

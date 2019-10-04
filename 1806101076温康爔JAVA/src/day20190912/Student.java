package day20190912;

import java.nio.file.Watchable;

public class Student {
    //1.成员变量
    //姓名、学号、年级、班级……

    String name;
    int number;

    //2.成员方法
    //学习、运动、睡觉、吃饭……
    void study(){}

    void sport(){}

    Student(String name,int number){
        this.name=name;
        this.number=number;
        System.out.println(name+"同学的学号为"+number);
    }

    public static void main(String[] args) {
        Student ming=new Student("小明",10021021);
        Student hong=new Student("小红",10091015);
    }
}

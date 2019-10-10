package day20190912;

public class Student {
    String name;
    String classNumber;
    Student(String name,String classNumber){
        this.name = name;
        this.classNumber = classNumber;
        System.out.println("这是一个构造函数");
    }

    void getName(){
        System.out.println("姓名是："+this.name);
    }
    void  getclassNumber(){
        System.out.println("班号是："+this.classNumber);
    }

    }


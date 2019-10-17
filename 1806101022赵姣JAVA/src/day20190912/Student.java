package day20190912;

public class Student {

    Student(int age,String name,String sex ){
        this.age=age;
        this.name=name;
        this.sex=sex;

    }

    //1.属性 成员变量
    int age;
    String name;
    String sex;

    //2.行为 成员方法
    void study(){
        System.out.println("学习java.");
    }
    void run(){
        System.out.println("锻炼身体！");
    }
}

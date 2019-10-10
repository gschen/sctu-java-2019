package lab_02.day20190912;

public class Student1 {
    // 1. 属性
    // 姓名、年级、年龄、身高
    Student1(String name,String grade,int age,int statrue){
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.statrue = statrue;
    }

    String name;
    String grade;
    int age;
    int statrue;
    // 2. 行为
    // 学习、运动
    void study(){
        System.out.println("快落秃头");
    }
    void run(){
        System.out.println("we have badminton class this afternoon.");
    }
    void skateboard(){
        System.out.println("the skateboard is wangyibo's favorite toy");
    }
}

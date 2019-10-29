package day20190912;

public class Student extends Pesron{
    private String classCode,name,sex,studentCode;
    private int age;

    public Student(String classCode, String name, String sex, String studentCode, int age) {
        this.classCode = classCode;
        this.name = name;
        this.sex = sex;
        this.studentCode = studentCode;
        this.age = age;
    }

    public void run(){
        System.out.println("学生跑步");
    }

    public void eat(){
        System.out.println("学生吃饭");
    }
}

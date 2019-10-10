package lab_02.day20190912.Test03;

public class Student {
    String name;
    String num;
    int age;
    int grade;
    boolean sex;
    public Student(String name, String num, int age,
                   int grade, boolean sex){
        this.name = name;
        this.num = num;
        this.age = age;
        this.grade = grade;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", sex=" + sex +
                '}';
    }
}

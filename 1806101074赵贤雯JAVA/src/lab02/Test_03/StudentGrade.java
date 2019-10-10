package lab02.Test_03;

/**3、 	设计一个表示学生的类，
 * 里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。*/
public class StudentGrade {
    StudentGrade(String name,int age,String gender,int computer,int math,int english){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.computer = computer;
        this.math = math;
        this.english = english;
    }

    // 1. 属性
    // 姓名，年龄，性别，计算机成绩，数学成绩，英语成绩

    String name;
    int age;
    String gender;
    int computer;
    int math;
    int english;

    // 2. 行为
    // 求总分，平均分，最高分，最低分，并输出一个学生的完整信息
    int total(){
        return computer+math+english;
    }
    double average(){
        return total()/3;
    }
    int max(){
        int max = computer>math?computer:math;
        max =max>english?max:english;
        return max;
    }
    int min(){
        int min = computer<math?computer:math;
        min =min<english?min:english;
        return min;
    }

    public static void main(String[] args) {
        StudentGrade stu = new StudentGrade("张三",18,"男",80,87,91);
        System.out.println("Sum：" + stu.total());
        System.out.println("Average：" + stu.average());
        System.out.println("Max：" + stu.max());
        System.out.println("Min：" + stu.min());

    }
}

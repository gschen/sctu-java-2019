package lab_02.test_03;

import java.util.Scanner;

public class Student {
    double Math;
    double Computer;
    double English;

    double Calgrade(){
        return Math + Computer + English;
    }

    double average(){
        return Calgrade()/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数学成绩：");
        int math = sc.nextInt();
        System.out.print("请输入英语成绩：");
        int english = sc.nextInt();
        System.out.print("请输入计算机成绩：");
        int computer = sc.nextInt();


        Student student = new Student();
        student.Math = math;
        student.Computer = computer;
        student.English = english;

        System.out.println( "总成绩为："+student.Calgrade());
        System.out.println("平均成绩："+student.average());
    }
}


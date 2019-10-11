package lab_02.Test_37;

import java.util.Scanner;

public class Test_37 {
    public static void main(String[] args) {
        int[] grade=new int[3];

        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的学历：1、本科生，2、研究生");
        int a=scanner.nextInt();
        System.out.println("请输入你三门科目的成绩");
        for (int i = 0; i <3 ; i++) {
            grade[i]=scanner.nextInt();
        }
        if (a==1){
            Undergraduate undergraduate=new Undergraduate(grade);
            undergraduate.avg();
        }
        else if (a==2){
            Postgraduate postgraduate=new Postgraduate(grade);
            postgraduate.avg();
        }


    }
}
abstract class Student{
    int[] grade=new int[3];
    abstract void avg();
}
class Postgraduate extends Student{
    public Postgraduate(int[] grade){
        this.grade=grade;
    }

    @Override
    void avg() {
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum+=grade[i];
        }
        if (sum/3>=80){
            System.out.println("你的平均成绩没有超过80分，不能拿到学位");
        }
        else {
            System.out.println("恭喜你获得学位");
        }
    }
}
class Undergraduate extends Student {
    public Undergraduate(int[] grade){
        this.grade=grade;
    }

    @Override
    void avg() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grade[i];
        }
        if (sum / 3 >= 60) {
            System.out.println("你的平均成绩没有超过60分，不能拿到学位");
        }
        else {
            System.out.println("恭喜你获得学位");
        }
    }
}
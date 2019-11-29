package src.week_1;

import java.util.Scanner;

public class Test_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩（1~5）：");
        int age = sc.nextInt();
        if (age==1){System.out.println("不及格");}
        else if (age==2){System.out.println("及格");}
        else if (age==3){System.out.println("中等");}
        else if (age==4){System.out.println("良好");}
        else if (age==5){System.out.println("优秀");}
        else {System.out.println("输入错误");}
    }

}

package lab01;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入成绩的等级");
        int n = sc.nextInt();
        if (n==1)
            System.out.println("成绩为85以上");
        else if (n==2)
            System.out.println("成绩为70到85");
        else if (n==3)
            System.out.println("成绩为60到70");
        else
            System.out.println("成绩为60分以下");
    }
}

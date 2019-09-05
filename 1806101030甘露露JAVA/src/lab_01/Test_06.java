package lab_01;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入成绩的等级");
        int score = sc.nextInt();
        if(score == 1)
             System.out.println("85分以上");
        else if ( score == 2 )
             System.out.println("70分以上");
        else if ( score == 3)
             System.out.println("60分以上");
        else
             System.out.println("60分以下");


    }
}

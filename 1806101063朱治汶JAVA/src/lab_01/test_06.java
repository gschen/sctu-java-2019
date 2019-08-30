package lab_01;

import java.util.Scanner;

public class test_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int n = sc.nextInt();
        if (n >= 85 ){
            System.out.println("A级");
        }
        else if (n >= 70 ){
            System.out.println("B级");
        }
        else if (n >= 60 ){
            System.out.println("C级");
        }
        else
            System.out.println("D级");
    }

}

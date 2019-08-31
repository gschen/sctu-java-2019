package lab_01;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int x6 = sc.nextInt();
        if (x6 >= 85) {
            System.out.println("A");
        } else if (x6 >= 70) {
            System.out.println("B");
        } else if (x6 >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

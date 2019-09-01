package lab01;

import java.util.Scanner;

public class test_06 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int n = mas.nextInt();
        if (n>=85)
            System.out.println("A级：85及以上");
        else if (n>=70)
            System.out.println("B级：70到85");
        else if (n>=60)
            System.out.println("C级：60到70");
        else
            System.out.println("D级：60分以下");
    }
}

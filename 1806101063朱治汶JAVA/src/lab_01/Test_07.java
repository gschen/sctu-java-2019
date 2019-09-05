package lab_01;

import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        double ran = Math.random();
        int n = (int)(ran * 100);
        int a = 0;

        while (a != n){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入所猜数字：");
            a = sc.nextInt();
            if (a < n){
                System.out.println("猜小了");
                continue;
            }
            if (a > n){
                System.out.println("猜大了");
                continue;
            }
            System.out.println("猜对了");
        }

    }
}

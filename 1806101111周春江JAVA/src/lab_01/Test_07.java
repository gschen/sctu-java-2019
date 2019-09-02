package lab_01;

import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        //实现随机数32
        double ran = Math.random();
        int i = (int)(ran * 100);

        //用户输入随机数
        int n = 0;
        while (n != i) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入所猜数字：");
            n = sc.nextInt();
            if (n < i) {
                System.out.println("猜小了");
                continue;
            } else if (n > i) {
                System.out.println("猜大了");
                continue;
            }
            System.out.println("猜对了");
        }
    }
}



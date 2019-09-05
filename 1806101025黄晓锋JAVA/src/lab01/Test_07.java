package lab01;

import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        double ran = Math.random();
        int a = (int) (ran * 100);
        int b = 0;

        while (a != b) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个1~100的数字猜想：");
            b = scanner.nextInt();
            if (a > b) {
                System.out.println("太小了！");
                continue;
            } else if (a < b){
                System.out.println("太大了！");
                continue;
            }
            else
            System.out.println("猜对了！");
        }
    }
}

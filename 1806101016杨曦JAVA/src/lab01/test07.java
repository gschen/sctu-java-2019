package lab_01;

import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = (int) (Math.random() * 100);             //生成一个0~100的随机数
        int y = -1;

        System.out.println("已生成0~100的随机整数，请输入您所猜的数：");

        while (x != y) {
            y = sc.nextInt();
            if (y > x) {
                System.out.println("输入的数过大");
            } else if (y < x) {
                System.out.println("输入的数过小");
            }
        }

        System.out.println("正确！该随机数是" + x);


    }
}
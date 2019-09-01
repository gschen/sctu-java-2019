package lab_01;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        Random gen = new Random();
        int a = gen.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        while (1==1) {
            System.out.println("请输入一个数字:");
            int b = in.nextInt();
            if (b > a) {
                System.out.println("猜大了");
            }
            else if (b < a) {
                System.out.println("猜小了");
            }
            if (b == a) {
                System.out.println("正确");
                break; }
        }
    }
}

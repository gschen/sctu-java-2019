package lab_01;

import java.util.Random;
import java.util.Scanner;


public class Test_07 {
    public static void main(String[] args) {

        int i = (int)(Math.random()*100)+1;
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("请输入一个数字:");
            int j = s.nextInt();
            if (j<i) {
                System.out.println("猜小了");
            }
            else if (j>i) {
                System.out.println("猜大了");
            }
            else {
                System.out.println("猜对了");
            }
        }
    }
}
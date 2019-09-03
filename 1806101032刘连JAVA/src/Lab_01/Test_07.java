package lab_01;

import java.util.Random;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        Random ra=new Random();
        int x=ra.nextInt(100);
        System.out.println(x);
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.print("请输入数");
            int y=input.nextInt();
            if (y == x) {
                System.out.println("恭喜你答对了");
                break;
            } else if (y < x) {
                System.out.println("你猜小了");
            } else if (y > x) {
                System.out.println("你猜大了");
            }
        }
    }
}


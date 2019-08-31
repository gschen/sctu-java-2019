package lab_01;

import java.util.Random;
import java.util.Scanner;

public class Test_07 {
    public static void main(String args[]){
        Random rand = new Random();
        int i = rand.nextInt();
        i = rand.nextInt(100);

        while (true) {
            Scanner scan_input = new Scanner(System.in);
            System.out.println("请输入一个1到100的整数：");
            int n = scan_input.nextInt();


            if (i < n) {
                System.out.println("猜大了");
            } else if (i > n) {
                System.out.println("猜小了");
            } else {

                System.out.println("正确");
            }
        }
    }
}

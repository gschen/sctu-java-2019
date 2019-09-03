package Lab_01;

import java.util.Random;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        Random num = new Random();
        int i = num.nextInt(100);
        Scanner s = new Scanner(System.in);
        for (;;){
            System.out.println("请输入一个数字:");
            int j = s.nextInt();
            if(j > i){
                System.out.println("猜大了");
                continue;
            }
            else if(j < i){
                System.out.println("猜小了");
                continue;
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}

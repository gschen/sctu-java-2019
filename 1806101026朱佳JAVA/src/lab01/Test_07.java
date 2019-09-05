package lab01;

import java.util.Random;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-100的数字");
        int s;
        int n = sc.nextInt();
        s =new Random().nextInt(100)+1;
        if (n>s){
            System.out.println("猜大了");}
        else if (n<s){
            System.out.println("猜小了");}
        else
            System.out.println("猜对啦");
    }
}



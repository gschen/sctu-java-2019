package lab_01;

//7、	编写一个Java应用程序，实现下列功能：
//1)	程序随机分配给客户一个1-100之间的整数。
//2)	用户输入自己的猜测。
//3)	程序返回提示信息，提示信息分别是：“猜大了”、“猜小了”和“猜对了”。
//4)	用户可根据提示信息再次输入猜测，直到提示信息是“猜对了”。

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
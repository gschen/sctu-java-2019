package week_1;

import java.util.Scanner;

public class Test_2_13 {
    public static void main(String[] args) {
        int x=0;
        System.out.println("请输入一个数:");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int y=2*x*x*x-4*x*x+3*x-6;
        System.out.println(y);
    }
}
package lab01;

import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = mas.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
     //for
    }
}


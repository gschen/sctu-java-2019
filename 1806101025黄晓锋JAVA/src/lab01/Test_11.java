package lab01;

import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {
        int a = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1~9999的数来判断其是否为回文数：");
        a = scanner.nextInt();
        String b = a + "";

        int length = b.length();
        for (int i = 0; i < length / 2; i++) {
            if (a >= 10000 ){
                System.out.println("输入数字错误！");
            }
            else if (b.toCharArray()[i] != b.toCharArray()[length - i - 1]) {
                System.out.println("该数字不是回文数！");
            }
            else {
                System.out.println("该数字是回文数！");
            }
        }
    }
}

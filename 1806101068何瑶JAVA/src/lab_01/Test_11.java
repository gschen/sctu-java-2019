package lab_01;

import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {
        int i, j, k, n, num = 0;
        System.out.println("请输入一个数:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num >= 1 & num <= 10000) {
            i = num / 1000;
            j = (num % 1000) / 100;
            k = (num % 100) / 10;
            n = num %10;
            if (i != 0) {
                System.out.println(num + "是4位数");
                if (i == n & j == k) {
                    System.out.println(num + "是回文数");
                }
                else {
                    System.out.println(num + "不是回文数");
                }
            }
            else if (j!=0){
                System.out.println(num + "是3位数");
                if (k ==j) {
                    System.out.println(num + "是回文数");
                }
                else {
                    System.out.println(num + "不是回文数");
                }
            }
            else if (k!=0){
                System.out.println(num + "是2位数");
                if (j ==i) {
                    System.out.println(num + "是回文数");
                } else {
                    System.out.println(num + "不是回文数");
                }
            }
            else {
                System.out.println(num + "是1位数");
                    System.out.println(num + "是回文数");
                }
            }
        else {
            System.out.println("该数不在1-999之间");
        }
        }
    }

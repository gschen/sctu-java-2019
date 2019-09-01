package lab01;

import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9999的数字");
        int n = sc.nextInt();
        if (n/1000!=0){
            System.out.println("这是一个四位数"); }
        else if (n/100!=0){
            System.out.println("这是一个三位数"); }
        else if (n/10!=0){
            System.out.println("这是一个两位数"); }
        else
        { System.out.println("这是一个一位数"); }
        int a = n/1000;
        int b = n/100%10;
        int c = n%100;
        int d = n%10;
        if (n==(d*1000+c*100+b*10+a)){
            System.out.println("这是一个回文数");}



}}

package lab01;

import java.util.Scanner;


public class test_07 {
    public static void main(String[] args) {
        int i=(int)(Math.random()*100);

        Scanner mas=new Scanner(System.in);
        System.out.println("请输入你的猜想：");
        int n=mas.nextInt();
        if(n>i){
            System.out.println("猜大了");
        }
        else if(n<i){
            System.out.println("猜小了");
        }
        else {
            System.out.println("猜对了");

        }
    }
}

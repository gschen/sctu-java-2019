package lab01;

import java.util.Scanner;
public class test06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n=sc.nextInt();
        if(n>=0&&n<=59){
            System.out.println("D");
        }
        else if(n>=60&&n<=69){
            System.out.println("C");
        }
        else if(n>=70&&n<=84){
            System.out.println("B");
        }
        else if(n>=85){
            System.out.println("A");
        }
        System.out.println();
        }
    }


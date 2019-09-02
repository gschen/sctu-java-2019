package lab_01;

import java.util.Scanner;

public class Test_06 {
    public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入分数：");
        int n = scan_input.nextInt();
        if (n>=85){
            System.out.println("A级");
        }
         else if (n>=70){
            System.out.println("B级");
        }
        else if (n>=60){
            System.out.println("C级");
        }
        else {
            System.out.println("D级");
        }
    }
}

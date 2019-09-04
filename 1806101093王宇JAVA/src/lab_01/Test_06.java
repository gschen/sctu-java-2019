package lab_01;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入：");
        int i = s.nextInt();
        if (i >= 85) {
            System.out.println("A级");
        }
        else if (i>=70){
            System.out.println("B级");
        }
        else if (i>=60){
            System.out.println("C级");
        }
        else if (i<60){
            System.out.println("D级");
        }
    }
}
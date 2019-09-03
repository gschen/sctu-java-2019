package lab_01;

import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}



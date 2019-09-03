package Lab_01;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        boolean flag=true;//是素数
        for (int i = 2; i <x ; i++) {
            if (x%i==0){
                flag=false;//不是素数
            }
        }
        if (flag){
            System.out.println(x+"是素数");
        }
        else {
            System.out.println(x+"不是素数");
        }
    }
}
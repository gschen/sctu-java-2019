package src.lab_02.Test_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try{
            Scanner scan_input = new Scanner(System.in);
            Scanner scan_input1 = new Scanner(System.in);
            int a = scan_input.nextInt();
            int b = scan_input1.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("除0错误");
        }
    }
}

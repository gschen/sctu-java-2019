package src.lab_02.Test_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan_input = new Scanner(System.in);
            System.out.println("请输入整形");
            int a = scan_input.nextInt();
        }catch (Exception e){

            System.out.println("输入错误");
        }

    }
}

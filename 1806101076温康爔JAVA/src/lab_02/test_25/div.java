package lab_02.test_25;

import java.util.InputMismatchException;
import  java.util.Scanner;

public class div {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入除数 按回车确认");
            num1 = scanner.nextInt();

            System.out.println("请输入被除数 按回车确认");
            num2 = scanner.nextInt();

        }
        catch (InputMismatchException e){
            System.out.println("输入的类型不合法");
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        if(num2 == 0) {
            System.out.println("num2 的值 不能是 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}


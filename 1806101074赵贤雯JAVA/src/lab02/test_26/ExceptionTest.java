package lab_02.test_26;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入除数:");
        int op1 = input.nextInt();
        System.out.println("请输入被除数：");
        int op2 = input.nextInt();
        int result = 0;
        try {
            result = op1 / op2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("异常处理");
        }
        System.out.println(result);
    }
}

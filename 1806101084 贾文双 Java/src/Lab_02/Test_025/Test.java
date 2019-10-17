package Lab_02.Test_025;

import java.util.Scanner;

//25、 	数字转换的异常处理。输入两个数，计算两个数想除的结果（考虑除数为0的异常情况）。
public class Test {
    public static void main(String[] args) {
        System.out.println("输入两个数字");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
            int i = s.nextInt();
            int i1 = s1.nextInt();
            try{
                System.out.println(i / i1);
            }catch (ArithmeticException e){
                System.out.println("除数不能为0");
            }finally {};

    }
}

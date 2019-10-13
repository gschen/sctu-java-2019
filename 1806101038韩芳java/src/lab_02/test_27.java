package lab_02;

import java.util.Scanner;

//27、 从键盘输入的值，如int，但实际从键盘输入非int值触发异常，并在catch中处理此异常，如输出异常的信息。
public class test_27 {
    public static void main(String[] args) {
        System.out.println("输入数值");
        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
        }catch (Exception e){
            System.out.println("请输入整形类型的数值");
        }
    }
}

package Lab_02.Test_027;

import java.util.Scanner;

//27、 	编写一个类实现通过scanner对象获得从键盘输入的值，如int，但实际从键盘输入非int值，如float，从而触发异常，并在catch中处理此异常，如输出异常的信息。
public class Test {
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

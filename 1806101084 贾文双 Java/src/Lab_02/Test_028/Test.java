package Lab_02.Test_028;

import java.util.Scanner;

//28、 	编写一个应用程序，要求从键盘输入一个double类型的圆的半径，计算并输出其面积。测试当输入的数据不是double型数据（如字符串“abc”）会产生什么结果，怎样处理。
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            double d = s.nextDouble();
            System.out.println("圆的面积为："+ Math.PI * d * d);
        }catch (Exception e){
            System.out.println("请正确输入半径");
        }
    }
}

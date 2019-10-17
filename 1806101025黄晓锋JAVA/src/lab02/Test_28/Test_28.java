package lab02.Test_28;

import java.util.Scanner;

public class Test_28 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输一个double类型的圆的半径，用于计算其面积：");
            double r = scanner.nextInt();    //输入一个double类型圆的半径。
            System.out.println("这个圆的面积是：" + r * r * 3.1415926);
        }
        catch (Exception e) {
            System.out.println("输入类型错误！");
        }
        finally {
        }
    }
}

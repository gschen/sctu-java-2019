package lab_02.Test_28;

import java.util.Scanner;

public class Test_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius;
        try {
            radius = scanner.nextDouble();
            double s= Math.PI * radius * radius;
            System.out.println(s);
        }catch (Exception e){
            System.out.println("你输入的数不是double类型的");
        }finally {
        }
    }
}

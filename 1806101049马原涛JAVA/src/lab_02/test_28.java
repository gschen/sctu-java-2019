package lab_02;

import java.util.Scanner;

public class test_28 {
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

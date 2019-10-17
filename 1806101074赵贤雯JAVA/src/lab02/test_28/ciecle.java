package lab_02.test_28;

import java.util.Scanner;

class circle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            double d = s.nextDouble();
            System.out.println("圆的面积为："+ Math.PI * d * d);
        }catch (Exception e){
            System.out.println("半径输入错误！");
        }
    }
}
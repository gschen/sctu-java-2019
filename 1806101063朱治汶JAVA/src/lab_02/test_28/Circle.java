package lab_02.test_28;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        double a;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入半径r：");

        try {
            a = sc.nextDouble();
            System.out.println("圆的面积为："+Math.PI*a*a);
        }catch (Exception e){
            System.out.println("输入的值不是double值");
      }finally {
        }



    }
}

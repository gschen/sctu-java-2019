package lab_02;

import java.util.Scanner;

public class Test_28 {
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

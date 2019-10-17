package lab02.Test_02;

import java.util.Scanner;

public class Test_02 {
//    double radius;
//    double calArea;
//
//    double radius(){
//        return 3.14 * this.radius * 2;
//    }
//    double calArea(){
//        return 3.14 * this.calArea * this.calArea;
//    }

    float r = 0;

    void getarea(){
        System.out.println("面积"+Math.PI*r*r);
    }
    void getpermeter(){
        System.out.println("周长"+Math.PI*r*2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入半径：");
        float a = sc.nextFloat();

        Test_02 circle = new Test_02();
        circle.r = a;
        circle.getarea();
        circle.getpermeter();

    }
}

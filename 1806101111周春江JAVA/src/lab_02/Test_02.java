package lab_02;

import java.util.Scanner;

public class Test_02 {
    int r;

    void getarea(){
        System.out.println("面积"+Math.PI*r*r);
    }
    void getpermeter(){
        System.out.println("周长"+Math.PI*r*2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入半径：");
        int a = sc.nextInt();

        Test_02 circle = new Test_02();
        circle.r = a;
        circle.getarea();
        circle.getpermeter();

    }
}

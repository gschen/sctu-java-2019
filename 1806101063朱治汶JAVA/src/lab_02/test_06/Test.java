package lab_02.test_06;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //三角形
        System.out.println("三角形");
        Scanner sc = new Scanner(System.in);
        //输入长度
        System.out.print("输入长度:");
        int a = sc.nextInt();
        //输入宽度
        System.out.print("输入宽度:");
        int b = sc.nextInt();
        //输入高度
        System.out.print("输入高度:");
        int c = sc.nextInt();

        Triangle triangle = new Triangle();
        triangle.box(a,b,c);
        triangle.panduan();

        //圆形
        System.out.println("梯形");
        //输入长度
        System.out.print("输入上底:");
        int sd = sc.nextInt();
        //输入宽度
        System.out.print("输入下底:");
        int xd = sc.nextInt();
        //输入高度
        System.out.print("输入高度:");
        int gao = sc.nextInt();
        Ladder ladder = new Ladder();
        ladder.box(sd,xd,gao);
        ladder.getArea();


        //圆形
        System.out.println("圆形");
        System.out.print("输入半径:");
        int r = sc.nextInt();

        Circle circle = new Circle();
        circle.getr(r);
        circle.getArea();
        circle.getPerimeter();


    }
}

package lab_02;


import java.util.Scanner;

public class test_5 {
    private float lenth;
    private float width;
    private float high;

    private test_5(float lenth, float width, float high) {
        System.out.println("计算立方体体积");
        this.lenth = lenth;
        this.width = width;
        this.high = high;
        System.out.println("长：" + lenth + "  宽：" + width + "  高：" + high);
    }

    ;

    private void reset() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请重新输入长：");
        lenth = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请重新输入宽：");
        width = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请重新输入高：");
        high = sc3.nextInt();
        test_5 a = new test_5(lenth, width, high);
        a.volume();//原地调用
    }

    ;

    private void volume() {
        float x;
        x = lenth * width * high;
        System.out.println("体积为：" + x);
    }

    ;


    public static void main(String[] args) {
        test_5 a = new test_5(6, 8, 10);
        a.volume();
        a.reset();

    }
}

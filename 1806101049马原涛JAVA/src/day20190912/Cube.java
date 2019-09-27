package day20190912;

import java.util.Scanner;

public class Cube {
    private float lenth;
    private float width;
    private float high;
    private Cube(float lenth,float width,float high){
        System.out.println("计算立方体体积");
        this.lenth=lenth;
        this.width=width;
        this.high=high;
        System.out.println("长："+lenth+"  宽："+width+"  高："+high);
    };
    private void reset(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("请重新输入长：");
        lenth=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("请重新输入宽：");
        width=sc2.nextInt();
        Scanner sc3=new Scanner(System.in);
        System.out.println("请重新输入高：");
        high=sc3.nextInt();
        Cube a=new Cube(lenth,width,high);
        a.volume();//原地调用
    };

    private void volume(){
                    float x;
                    x=lenth*width*high;
                    System.out.println("体积为："+x);
                    };


    public static void main(String[] args) {
        Cube a=new Cube(10,5,8);
        a.volume();
        a.reset();

    }
}

package lab_02.Test_06;

import java.util.Scanner;

public class Test_06_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请依次输入梯形的高、上底、下底：");
        double h=input.nextDouble();
        double y=input.nextDouble();
        double x=input.nextDouble();
        Ladder ladder=new Ladder(h,x,y);
        ladder.print();
    }
}
//梯形
class Ladder{
    private double h;
    private double x;
    private double y;
    public Ladder(double h,double x,double y){
        this.h=h;
        this.y=y;
        this.x=x;
    }
    public void print(){
        System.out.println("梯形的面积为："+((x+y)*h/2));
    }
}

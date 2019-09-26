package lab_02;

import java.util.Scanner;

public class Test_06_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r=input.nextDouble();
        Circle circle=new Circle(r);
        circle.print();
    }
}
//圆形
class Circle{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 3.14*2*r;
    }
    public void print(){
        System.out.println("圆的周长为："+this.perimeter()+"圆的面积为："+this.area());
    }
}

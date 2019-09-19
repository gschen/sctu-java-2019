package lab_02;

import java.util.Scanner;

public class Test_06_01 {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入三角形的三条边：");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double z=input.nextDouble();
        triangle.setX(x);
        triangle.setY(y);
        triangle.setZ(z);
        triangle.print();
    }
}
//三角形
class Triangle{
    private double x;
    private double y;
    private double z;
    public Triangle(){}
    public Triangle(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    //面积
    public double area(){
        double p=(x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));

    }
    //周长
    public double perimeter(){
        return x+y+z;
    }
    public boolean judge(){
        if (x+y>z && x+z>y && z+y>x){
            return true;
        }
        else {
            return false;
        }
    }

    public void print(){
        if (this.judge()){
            System.out.println("三角形的周长为："+this.perimeter()+"三角形的面积为："+this.area());
        }
        else {
            System.out.println("你输入的三条边不满足要求");
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

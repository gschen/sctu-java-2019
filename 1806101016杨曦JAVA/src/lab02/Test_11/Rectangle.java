package lab02.Test_11;

public class Rectangle implements Printx {   //矩形类
    double a,b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        return a*b;
    }
    public double getLength(){
        return (a+b)*2.0;
    }
    public void printMyWay(){
        System.out.println("该矩形的长 a="+a+"宽 b="+b);
        System.out.println("面积 s="+getArea());
        System.out.println("周长 i="+getLength());
    }
}

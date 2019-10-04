package lab02.Test_11;

public class Square extends Rectangle{
    double c;
    Square(double a, double b) {
        super(a, b);
    }
    public double getD(){
        c=Math.sqrt(a*a+b*b);
        return  c;
    }
    public void printMayWay(){
        System.out.println("该长方形的长 a="+a+"宽 b="+b);
        System.out.println("面积 s="+getArea());
        System.out.println("周长 i="+getLength());
        System.out.println("对角线 d="+getD());
    }
}

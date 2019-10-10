package lab_02;
import java.util.Scanner;
class MyException extends Test_28 {
    private int a;
    private String s;
    public MyException(int a,String s){
        this.a=a;
        this.s=s;
    }
}
class Circle7{
    private double radius;
    Circle7(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double area(){
        return 2*3.14*radius;
    }
}
public class Test_28{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a;
        Circle7 c=new Circle7(2);
        System.out.println("输入一个double数字：");
        try{
            a=in.nextDouble();
            c.setRadius(a);
        }catch (Exception e){
            System.out.println("接受异常");
        }
        System.out.println(" "+c.area());
    }
}

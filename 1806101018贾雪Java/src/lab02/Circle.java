package lab02;
import java.util.Scanner;
public class Circle {
//    public static void main(String[] args) {
//        int r;
//        final double PI=3.14d;
    Scanner sc=new Scanner(System.in);

    //1.属性
    double radius;
    //2.方法
    double calArea(){
        return 3.14 * this.radius* this.radius;

    }
    double calLenght(){
        return 3.14*this.radius*2;

    }
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=1;
        c1.calArea();
        c1.calLenght();
        System.out.print(c1.calArea());
        System.out.println(c1.calLenght());

    }
}

package lab_02.Test_02;
import java.math.*;
/*2、 	设计一个圆形类，可以返回圆的面积与周长。*/
public class Circle {
    double radius;
    double cls(){
        return Math.PI * this.radius * this.radius;
    }

    double cll(){
        return Math.PI * 2 * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1;
        c1.cls();
        c1.cll();
        System.out.println("面积：" + c1.cls() +"\n" +"周长："+ c1.cll());
}
}

package lab_02.Test_14;

public class Test_14 {
    public static void main(String[] args) {
        Rectangle2 rectangle2=new Rectangle2(5,6);
        System.out.println(rectangle2.getArea());
        Circle3 circle3=new Circle3(5);
        System.out.println(circle3.getArea());
    }
}
abstract class Shape2{
    abstract double getArea();
}
class Rectangle2 extends Shape2{
    double width;
    double height;
    public Rectangle2(double width,double height){
        this.height=height;
        this.width=width;
    }
    @Override
    double getArea() {
        return width*height;
    }
}
class Circle3 extends Shape2{
    double r;
    public Circle3(double r){
        this.r=r;
    }
    @Override
    double getArea() {
        return 3.14*r*r;
    }
}

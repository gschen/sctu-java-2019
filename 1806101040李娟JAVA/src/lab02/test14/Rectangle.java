package lab02.test14;

public class Rectangle extends Shape{

    @Override
    void getArea(double a, double b) {
        System.out.println("长方形的面积："+ a * b);
    }
}

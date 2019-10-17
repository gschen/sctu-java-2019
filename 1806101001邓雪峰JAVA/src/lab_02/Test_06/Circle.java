package lab_02.Test_06;

public class Circle {
    double r;
    double PI = 3.14;

    double round(){
        return 2*PI*r;
    }
    double area(){
        return r*PI*r;
    }

    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.r = 3;

        System.out.println("该圆形周长为："+circle.round());
        System.out.println("该圆形面积为："+circle.area());
    }
}

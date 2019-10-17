package lab_02.Test_06;
//        3)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。
public class Circle {
    private double radius;
    private double grith;
    private double area;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return 3.1415926535 * radius * radius;
    }
    public  double grith(){
        return 3.1415926535 * (radius * 2);
    }
}

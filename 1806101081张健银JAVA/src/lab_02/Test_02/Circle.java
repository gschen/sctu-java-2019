package lab_02.Test_02;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return 3.1415926535 * radius * radius;
    }

    public double grith(){
        return 3.1415926535 * (radius + radius);
    }
}

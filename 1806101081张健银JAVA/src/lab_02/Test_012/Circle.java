package lab_02.Test_012;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("面积为：" + 3.1415926535 * (radius * radius));
    }

    @Override
    public void grith() {
        System.out.println("周长为：" + 3.1415926535 * (radius + radius));
    }
}

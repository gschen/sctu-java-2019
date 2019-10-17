package Lab02.Test14;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setd(4);
        System.out.println("圆的面积是" + circle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLenWid(3, 4);
        System.out.println("矩形的面积是" + rectangle.getArea());
    }
}

package lab_02.test_14;

public class Test {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        ((Rectangle) rect).lenght = 3;
        ((Rectangle) rect).width = 2;
        rect.getArea();

        Shape circle = new Circle();
        ((Circle) circle).r = 5;
        circle.getArea();
    }

}

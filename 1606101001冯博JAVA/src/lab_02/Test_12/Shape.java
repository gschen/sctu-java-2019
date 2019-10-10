package lab_02.Test_12;

public class Shape {
    void length(){}
    void area(){}
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular();
        rectangular.length(3,4);
        rectangular.area(3,4);
        Circle circle = new Circle();
        circle.length(5.2);
        circle.area(3.2);
    }
}

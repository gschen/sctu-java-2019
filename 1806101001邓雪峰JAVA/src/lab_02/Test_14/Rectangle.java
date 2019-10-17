package lab_02.Test_14;

public class Rectangle extends Shape{
    double width;
    double height;
    @Override
    public void getArea() {
        System.out.println(width*height);
    }
}

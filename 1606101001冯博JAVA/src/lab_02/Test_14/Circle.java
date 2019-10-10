package lab_02.Test_14;

public class Circle extends Shape {
    @Override
    void getArea(int radius, int length, int width) {
        int area = (int)(radius*3.14*radius);
        System.out.println(area);
    }
}

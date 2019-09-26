package lab_02.Test_14;

public class Rectangle  extends Shape {
    @Override
    void getArea(int radius, int length, int width) {
        int area = (int)(length*width);
            System.out.println(area);
    }
}

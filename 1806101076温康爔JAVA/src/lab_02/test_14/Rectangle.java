package lab_02.test_14;

//矩形类
public class Rectangle extends Shape {

    double length;

    double width;

    double getArea() {

        return length * width;
    }

    void setLenWid(double Length, double Width) {
        length = Length;
        width = Width;
    }
}

package lab02.Test_14;

public class Rectangle extends Shape {

    Rectangle(){
        System.out.println("这是一个矩形");
    }

    int lenght;
    int width;

    @Override
    void getArea() {
        System.out.println("面积为："+lenght*width);
    }
}

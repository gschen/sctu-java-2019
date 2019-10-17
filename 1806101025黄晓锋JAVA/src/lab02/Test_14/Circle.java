package lab02.Test_14;

public class Circle extends Shape {

    Circle(){
        System.out.println("这是一个圆");
    }

    int r;

    @Override
    void getArea() {
        System.out.println("面积为："+Math.PI*r*r);
    }
}
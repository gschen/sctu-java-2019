package lab_02.Test_14;

public class Circle extends Shape {


    @Override
    void getArea(int radio) {
        int area = (int) (radio*3.14*radio);
        System.out.println("圆的面积为："+area);
    }
}

package lab_02.Test_14;

public class Rectangle extends lab_02.Test_14.Shape {
    @Override
    void getArea(int radio) {
        int area = radio*radio;
        System.out.println("正方形面积为："+area);
    }


}

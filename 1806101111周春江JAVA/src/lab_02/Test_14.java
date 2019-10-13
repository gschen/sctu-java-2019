package lab_02;

import java.awt.*;

public class Test_14 {
    public abstract class Circle implements Shape {

        Circle() {
            System.out.println("这是一个圆");
        }

        int r;


        void getArea() {
            System.out.println("面积为：" + Math.PI * r * r);
        }


    }
}

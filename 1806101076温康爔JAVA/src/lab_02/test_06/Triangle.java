package lab_02.test_06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Triangle {
    //1.属性
    //三边abc、周长C、面积S
    double sideA, sideB, sideC, length, area;
    boolean boo;

    //2.行为
    //返回周长、面积、修改三边、判断是否能构成三角形
    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        if ((sideA + sideB) > sideC || (sideA + sideC) > sideB || (sideC + sideB) > sideA)
        //abc构成三角形的条件表达式
        {
            boo = true;
        } else {
            boo = false;
        }
    }

    double getLength() {
        double length = sideA + sideB + sideC;
        return length;
    }

    double getArea() {
        if (boo) {
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return area;
        } else {
            System.out.println("不是一个三角形，不能计算面积");
            return 0;
        }
    }
    public static void main(String[] args) {
        Triangle d = new Triangle(3, 4, 5);
        System.out.println("三角形的周长为："+d.getLength());
        System.out.println("三角形的面积为："+d.getArea());
        Triangle l = new Triangle(1,2,3);
        System.out.println("三角形的面积为："+l.getArea());
    }
}


package lab02.Test_02;
//2、 	设计一个圆形类，可以返回圆的面积与周长。

public class Circle {
    // 1. 属性
        double radius;


    // 2. 方法
    // 计算圆的面积和周长

    double calArea(){
        return 3.14 * this.radius * this.radius;
    }

    double calLength(){
        return 3.14 * 2 * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1;

        c1.calArea();
        c1.calLength();
        System.out.println("当半径为 "+c1.radius+" 时\n"+"面积为"+c1.calArea()+"\n周长为 "+c1.calLength());
    }

}

package lab02.test14;

//14、 	定义一个抽象类Shape，它包含一个抽象方法getArea()，从Shape类派生出Rectangle和Circle类，
// 这两个类都用getArea()方法计算对象的面积。编写应用程序使用Rectangle和Circle类。
public class Circle extends Shape{

    @Override
    void getArea(double a, double b) {
        System.out.println("圆的面积；"+a * b * 3.14);
    }
}

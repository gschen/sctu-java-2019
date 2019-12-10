package lab_02.Test_12;
/*12、 	按下述要求实现程序：
        1）	定义一个图形类Shape，定义两个方法分别用来求面积和周长。（这两个方法的体内容应该为空）
        2）	定义图形类Shape的子类Rectangular类重写求面积及周长的功能
        3）	定义图形类Shape的子类Circle类重写求面积及周长的功能*/

public class Shape {
    double width;
    double length;
    double acreage;
    double perimeter;
    double radius;
    void Rectangle(){}
    void Circle(){}
}

class Test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,1);
        Circle circle = new Circle(1);
        System.out.println();
    }
}

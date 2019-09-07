package Lab02.Test02;

public class Circle {
    //1.属性
    double radius;
    //2.成员方法
    //计算圆的面积和周长
    void calArea(){
        System.out.println("面积为: " + 3.14 * this.radius * this.radius);
    }
    void calLength(){
        System.out.println("周长为： " + 2 * 3.14 * this.radius);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1;
        c1.calArea();
        c1.calLength();
    }
}

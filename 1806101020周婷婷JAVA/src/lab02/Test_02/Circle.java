package lab02.Test_02;

public class Circle {
    //属性
    double radius;
    //成员方法
    //计算圆的周长
    double calArea(){
        return 3.14 * this.radius * this.radius;
    }
    double caLength(){
        return  2 * 3.14 * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1;

        c1.calArea();
        c1.caLength();
    }
}

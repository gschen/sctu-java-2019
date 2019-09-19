package day20190905.test_2;

public class Circle {

    double radius;

    double calArea(){
        return 3.14*this.radius*this.radius;
    }
    double calLength(){
        return 3.14*2*this.radius;
    }

    public static void main(String[] args) {

    Circle c1 = new Circle();

        System.out.println("周长："+c1.calLength());
        System.out.println("面积："+c1.calArea());
    }
}

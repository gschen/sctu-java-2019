package lab02.test06;

//3)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能

public class Circle {

    double radius;

    double calArea(){
        return this.radius * this.radius * 3.14;
    }

    double calLength(){
        return 2 * 3.14 * this.radius;
    }

    public static void main(String[] args) {
        Circle c1=new Circle();

        c1.radius=3;

        c1.calArea();
        c1.calLength();

        System.out.println(c1.calArea());
        System.out.println(c1.calLength());

    }
}

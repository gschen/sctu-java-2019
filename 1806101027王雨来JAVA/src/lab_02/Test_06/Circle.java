package lab_02.Test_06;
//3)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。
public class Circle {
    double r;
    double l;
    double s;
    public Circle(double r){
        this.r = r;
        this.l = 2*Math.PI*r;
        this.s = Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", l=" + l +
                ", s=" + s +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle);
    }
}

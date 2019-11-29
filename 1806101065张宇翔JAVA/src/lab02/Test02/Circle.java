package Test02;

public class Circle {
    //属性
    double radius;
    //成员方法
    double calArea(){
        return 3.14 * this.radius * this.radius;
    }
    double calLength(){
        return 2 * 3.14 * this.radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1;


        System.out.println(c1.calArea());
        System.out.println(c1.calLength());
    }
}

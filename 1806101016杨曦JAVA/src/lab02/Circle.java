package lab02;

public class Circle {
    double r;
    double calArea(){return 3.14*this. r*this.r;}
    double calLength(){return 2*3.14*this.r;}

    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.r=1;
        c1.calArea();
        c1.calLength();
        System.out.println(c1.calArea());
        System.out.println(c1.calLength());

    }
}

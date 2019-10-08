package lab_02.test_06;

public class Circle {

    public double radius,c,s;

    public Circle(double r){
        radius=r;
    }


    public double getS(){
        s=3.14*radius*radius;
        return s;
    }

    public double getC(){
        c=2*3.14*radius;
        return c;
    }


}

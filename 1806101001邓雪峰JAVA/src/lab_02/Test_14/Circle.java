package lab_02.Test_14;

public class Circle extends Shape{
    double PI =3.14;
    double r;
    @Override
    public void getArea() {
        System.out.println(r*r*PI);
    }
}

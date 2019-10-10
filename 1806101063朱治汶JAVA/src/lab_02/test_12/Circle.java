package lab_02.test_12;

public class Circle implements Shape {

    int r;
    @Override
    public void getarea() {

        System.out.println(Math.PI*r*r);

    }

    @Override
    public void getperimeter() {
        System.out.println(2*Math.PI*r);
    }
}

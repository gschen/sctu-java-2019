package lab_02.test_12;

public class Main {
    public static void main(String[] args) {
        Shape a;
        Rectangular b=new Rectangular();
        Circle c=new Circle();
        a=b;
        a.area();
        a.length();
        a=c;
        a.area();
        a.length();
    }
}

package lab_02.Test_06;

public class Test_06_Test {
    public static void main(String[] args) {
        Traingle t = new Traingle(5,6,7);
        System.out.println(t.area());
        System.out.println(t.grith());
        System.out.println(t.judge());
        System.out.println(t.getArea());
        System.out.println(t.getGrith());

        Ladder l = new Ladder(10,11,5);
        System.out.println(l.area());

        Circle c = new Circle(3);
        System.out.println(c.area());
        System.out.println(c.grith());
    }
}

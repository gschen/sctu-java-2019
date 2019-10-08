package lab_02.test_11;

public class TestClass {
    public static void main(String[] args) {
        Rectangle d = new Rectangle(3,4);
        System.out.println(d.getClass().getName()+"矩形");
        d.printMyway();
        Square l = new Square(6,6);
        System.out.println(l.getClass().getName()+"正方形");
        l.printMyway();
        l.diagonal();
    }
}

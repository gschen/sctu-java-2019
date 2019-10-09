package lab_02.test_016;

public class CalculationTest {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(1,2));
        Reduce r = new Reduce();
        System.out.println(r.reduce(2,3));
        Ride r1 = new Ride();
        System.out.println(r1.ride(4,5));
        Except e = new Except();
        System.out.println(e.except(10,4));


        Calculation c = new Add();
        System.out.println(c.add(1,2));
    }
}

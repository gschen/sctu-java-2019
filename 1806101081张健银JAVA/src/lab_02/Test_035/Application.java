package lab_02.Test_035;

public class Application {
    public static void main(String[] args) {
        Manager m = new Manager(10000);
        System.out.println(m.computeSalary());

        Worker w = new Worker(100,20);
        System.out.println(w.computeSalary());

        Salesman s = new Salesman(5000,1000);
        System.out.println(s.computeSalary());
    }
}

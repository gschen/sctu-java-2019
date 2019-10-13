package Lab02.Test04;

public class Employee03 {
    public static void main(String[] args) {
        Employee02 emp = null;
        emp = new Employee02();
        emp.number="001";
        emp.name="张三";
        emp.salary=1000;
        emp.time=5;
        emp.imformation();
        emp.inctell();
        emp.total();
    }
}

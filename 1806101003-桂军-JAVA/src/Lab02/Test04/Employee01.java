package Lab02.Test04;

public class Employee01 {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        emp1.print();
        Employee emp2 = new Employee("010101");
        emp2.print();
        Employee emp3 = new Employee("020202", "张三");
        emp3.print();
        Employee emp4 = new Employee("030303", "李四", "人资", 3000);
        emp4.print();
    }
}

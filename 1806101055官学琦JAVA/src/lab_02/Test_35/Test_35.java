package lab_02.Test_35;

public class Test_35 {
    public static void main(String[] args) {
        Manager manager=new Manager(9000);
        Salesman salesman=new Salesman(3000,5000);
        Worker worker=new Worker(30,120);
        System.out.println("经理的工资："+manager.computeSalary()+"\n销售人员的工资："+salesman.computeSalary()+"\n工人的工资："+worker.computeSalary());
    }

}
abstract class Employee{
    int pay;
    abstract int computeSalary();
}
class Manager extends Employee{
    public Manager(int pay){
        this.pay=pay;
    }

    @Override
    int computeSalary() {
        return pay;
    }
}
class Salesman extends Employee{
    int salesmanup;
    public Salesman(int salesmanup,int pay){
        this.salesmanup=salesmanup;
        this.pay=pay;
    }
    @Override
    int computeSalary() {
        return pay+salesmanup;
    }
}
class Worker extends Employee{
    int day;
    int money;
    public Worker(int day,int money){
        this.day=day;
        this.money=money;
    }
    @Override
    int computeSalary() {
        return day*money;
    }
}
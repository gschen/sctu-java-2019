package lab_02;

abstract class Test_35 {
    private String name;
    public Test_35(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract double computeSalary();
}
class Manager extends Test_35{
    double monthSalary;
    public Manager(String name,double monthSalary){
        super(name);
        this.monthSalary=monthSalary;
    }
    public double computeSalary(){
        return monthSalary;
    }
}
class Salesman extends Test_35{
    double baseSalary;
    int quantity;
    double commision;
    public Salesman(String name,double baseSalary,int quantity,double commision){
        super(name);
        this.baseSalary=baseSalary;
        this.quantity=quantity;
        this.commision=commision;
    }
    public double computeSalary(){
        return baseSalary+quantity*commision;
    }
}
class Worker extends Test_35{
    int days;
    double dailySalary;
    public Worker(String name,int days,double dailySalary){
        super(name);
        this.days=days;
        this.dailySalary=dailySalary;
    }
    public double computeSalary(){
        return days*dailySalary;
    }
}
class Test_35Demo{
    public static void main(String[] args) {
        Manager m=new Manager("张三",10000);
        Salesman s=new Salesman("李四",2000,50,80);
        Worker w=new Worker("王五",28,80);
        System.out.println("经理"+m.getName()+"的工资为"+m.computeSalary());
        System.out.println("销售人员"+s.getName()+"的工资为"+s.computeSalary());
        System.out.println("工人"+w.getName()+"的工资为"+w.computeSalary());
    }
}

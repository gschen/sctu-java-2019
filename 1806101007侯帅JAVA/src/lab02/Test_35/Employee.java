package lab02.Test_35;

public abstract class Employee {
    public float Salary1,Salary2,Salary3;
    abstract void computeSalary();
   public Employee(float Salary1,float Salary2,float Salary3){

   }//定义一个构造函数，计算工资
}
class Manager extends Employee{

    public Manager(float Salary1, float Salary2, float Salary3) {
        super(Salary1, Salary2, Salary3);
    }
    @Override
    void computeSalary() {
        System.out.println("这个人的工资是："+this.Salary1);
    }

}
class Salesman extends Employee{

    public Salesman(float Salary1, float Salary2, float Salary3) {
        super(Salary1, Salary2, Salary3);
    }

    @Override
    void computeSalary() {

        System.out.println("这个人的工资是："+(this.Salary2+this.Salary1));
    }
}
abstract class Worker extends Employee{

    public Worker(float Salary1, float Salary2, float Salary3) {
        super(Salary1, Salary2, Salary3);
    }

    void computeSalary(int day) {
        System.out.println("工资是："+this.Salary3*day);
    }
}
class Test{
    public static void main(String[] args) {

    }
}
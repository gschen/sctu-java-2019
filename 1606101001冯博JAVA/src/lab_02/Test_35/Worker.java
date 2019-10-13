package lab_02.Test_35;

public class Worker extends Employee {

    public Worker(float Salary1, float Salary2, float Salary3) {
        super(Salary1, Salary2, Salary3);
    }
    @Override
    void computeSalary(int day) {
        System.out.println("工资是："+this.Salary3*day);
    }
}

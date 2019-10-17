package lab_02.Test_35;

public class Manager extends Employee {
    public Manager(float Salary1, float Salary2, float Salary3) {
        super(Salary1, Salary2, Salary3);
    }
    @Override
    void computeSalary() {
        System.out.println("这个人的工资是："+this.Salary1);
    }
}

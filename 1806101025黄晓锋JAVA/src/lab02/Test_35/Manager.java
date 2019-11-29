package lab02.Test_35;

public class Manager extends Employee {

    public Manager(double m_basis){
        basis = m_basis;
    }

    @Override
    public double computeSalary() {
        return basis;
    }

    public void show(){
        System.out.println("工资"+computeSalary());
    }
}

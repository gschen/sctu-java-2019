package lab_02.test_35;

public class Worker extends Employee {

    public int days;
    public Worker(int days,double m_basis){
        this.days = days;
        basis = m_basis;
    }
    @Override
    public double computeSalary() {
        return days * basis;
    }

    public void show(){
        System.out.println("工资"+computeSalary());
    }
}

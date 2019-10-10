package lab_02.test_35;

public class Salesman extends Employee{

    double deduction;
    public  Salesman(double deduction,double m_basis){
        this.deduction = deduction;
        this.basis = m_basis;
    }

    @Override
    public double computeSalary() {
        return basis * deduction;
    }

    public void show(){
        System.out.println("工资"+computeSalary());
    }
}

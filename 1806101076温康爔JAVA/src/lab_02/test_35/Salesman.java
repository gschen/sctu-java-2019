package lab_02.test_35;

public class Salesman extends Employee {
    public double commissions;
    Salesman(double commissions,double m_basis){
        double commission = commissions;
        basis=m_basis;
    }
    public double ComputerSalary(){
        return basis+commissions;
    }

    @Override
    public void Salary() {

    }

    public void show(){
        System.out.println("工资:"+ComputerSalary());
    }
}

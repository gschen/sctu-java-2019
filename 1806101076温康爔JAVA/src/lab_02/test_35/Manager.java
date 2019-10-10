package lab_02.test_35;

public class Manager extends Employee {
    public Manager(double m_basis){
        basis=m_basis;
    }
    public double ComputerSalary(){
        return basis;
    }

    @Override
    public void Salary() {

    }

    public void show(){
        System.out.println("工资:"+ComputerSalary());
    }
}

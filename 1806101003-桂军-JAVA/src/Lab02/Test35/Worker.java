package Lab02.Test35;

public class Worker extends Employee {
    public int days;
    Worker(int days,double m_basis){
        this.days=days;
        basis=m_basis;
    }
    public double ComputerSalary(){
        return days*basis;
    }

    @Override
    public void Salary() {

    }

    public void show(){
        System.out.println("工资:"+ComputerSalary());
    }
}

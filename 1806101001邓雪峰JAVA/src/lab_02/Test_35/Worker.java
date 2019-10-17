package lab_02.Test_35;

public class Worker extends Employee {
    int day;
    double perDiem;

    @Override
    public double computeSalary() {
        return day*perDiem;
    }
}

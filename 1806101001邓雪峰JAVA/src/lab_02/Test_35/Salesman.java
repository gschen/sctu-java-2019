package lab_02.Test_35;

public class Salesman extends  Employee {
    double basic;
    double develop;

    @Override
    public double computeSalary() {
        return basic+develop;
    }
}

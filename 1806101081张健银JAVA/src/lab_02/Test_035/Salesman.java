package lab_02.Test_035;

public class Salesman extends Employee {
    private int salesmanMoney;
    private int up;

    public Salesman(int salesmanMoney,int up) {
        this.salesmanMoney = salesmanMoney;
        this.up = up;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "salesmanMoney=" + salesmanMoney +
                ", up=" + up +
                '}';
    }

    @Override
    public int computeSalary() {
        return salesmanMoney+up;
    }
}

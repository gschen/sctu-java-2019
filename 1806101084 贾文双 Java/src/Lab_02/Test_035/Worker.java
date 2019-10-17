package Lab_02.Test_035;

public class Worker extends Employee{

    private int basicMoney;
    private int day;

    public Worker(int basicMoney, int day) {
        this.basicMoney = basicMoney;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "basicMoney=" + basicMoney +
                ", day=" + day +
                '}';
    }

    @Override
    public int computeSalary() {
        return day*basicMoney;
    }
}

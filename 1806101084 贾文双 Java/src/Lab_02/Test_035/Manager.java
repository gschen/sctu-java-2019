package Lab_02.Test_035;

public class Manager extends Employee{

    private int managerMoney;

    public int getManagerMoney() {
        return managerMoney;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerMoney=" + managerMoney +
                '}';
    }

    public void setManagerMoney(int managerMoney) {
        this.managerMoney = managerMoney;
    }

    public Manager(int managerMoney) {
        this.managerMoney = managerMoney;
    }

    @Override
    public int computeSalary() {
        return managerMoney;
    }
}

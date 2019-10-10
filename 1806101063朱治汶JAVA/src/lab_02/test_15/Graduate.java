package lab_02.test_15;

public class Graduate implements StudentInterface,TeacherInterface {

    String name;
    String sex;
    int age;
    private int fee;
    private int pay;

    @Override
    public void setFee(int fee) {
       this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public int getPay() {
        return pay;
    }
}

package lab_02.Test_015;

import lab_02.Test_015.interfacePak.StudentInterface;
import lab_02.Test_015.interfacePak.TeacherInterface;

public class Graduate implements TeacherInterface, StudentInterface {
    private String name,sex;
    private int age,pay,fee;

    public Graduate(int pay, int fee) {
        this.pay = pay;
        this.fee = fee;
    }

    @Override
    public void setFee() {
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay() {
        this.pay = pay;
    }

    @Override
    public int getPay() {
        return pay;
    }
}

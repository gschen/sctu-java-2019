package lab_02.Test_15;


import java.util.Scanner;

public class Graduate implements StudentInterface , TeacherInterface {
    String name;
    byte sex;
    int age;
    double fee;
    double pay;

    @Override
    public double setFee() {
        System.out.println("请输入学费");
        Scanner fee = new Scanner(System.in);
        double  value = fee.nextDouble();
        return value;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public double setPay() {
        System.out.println("请输入工资");
        Scanner pay = new Scanner(System.in);
        double  money = pay.nextDouble();
        return money;

    }

    @Override
    public double getPay() {
        return pay;
    }
}

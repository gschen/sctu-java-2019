package lab_02.test_35;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int days;
        double basis;
        double deduction;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入基本工资:");
        basis = sc.nextDouble();
        System.out.println("请输入工作天数：");
        days = sc.nextInt();
        System.out.println("请输入销售提成：");
        deduction = sc.nextDouble();

        Manager a = new Manager(basis);
        a.show();
        Salesman b = new Salesman(deduction,basis);
        b.show();
        Worker c = new Worker(days,basis);
        c.show();


    }
}

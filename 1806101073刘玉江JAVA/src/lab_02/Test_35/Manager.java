package src.lab_02.Test_35;

import java.util.Scanner;

public class Manager extends Employee {
    public Manager(int mybasis){
        basis = mybasis;
    }
    @Override
    public int ConputeSalary() {
        return basis;
    }

    @Override
    public int Adds() {
        return 0;
    }

    public void show(){
        System.out.println("经理的工资为："+ConputeSalary());
    }
    public static void main(String[] args) {
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入基本的工资");
        int basis = scan_input.nextInt();
        Manager a = new Manager( basis);
        a.show();
    }
}

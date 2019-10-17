package src.lab_02.Test_35;

import java.util.Scanner;

public class Salesman extends Employee {
    public Salesman(int mybasis, int myadd){
        basis = mybasis;
        add = myadd;
    }

    @Override
    public int ConputeSalary() {
        return basis;

    }

    @Override
    public int Adds() {
        return add;
    }
    public void printInfo(){
        int sun = basis+add;
        System.out.println("销售的工资为："+sun);
    }

    public static void main(String[] args) {
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入你的基本工资");
        int basic1 = scan_input.nextInt();
        Scanner scan_input1 = new Scanner(System.in);
        System.out.println("请输入你的提成");
        int add1 = scan_input.nextInt();
        Salesman b = new Salesman(basic1,add1);
        b.printInfo();

    }
}

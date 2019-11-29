package src.lab_02.Test_35;

import java.util.Scanner;

public class Worker extends Employee {
    public Worker(int mydays,int mydaysalary){
        days = mydays;
        doysalary = mydaysalary;
    }
    @Override
    public int ConputeSalary() {
        return 0;
    }

    @Override
    public int Adds() {
        return 0;
    }
    public void shows(){
        int sum1 = days*doysalary;
        System.out.println("一般工人的工资为："+ (sum1));
    }

    public static void main(String[] args) {
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入工作天数:");
        int days = scan_input.nextInt();
        Scanner scan_input1 = new Scanner(System.in);
        System.out.println("请输入每天的工资：");
        int daysalary = scan_input1.nextInt();
        Worker a = new Worker(days,daysalary);
        a.shows();
    }
}

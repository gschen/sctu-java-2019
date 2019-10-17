package Lab_02.Test_15;

import java.util.Scanner;

public class GraduateTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你的学费");
        int pay = s.nextInt();
        System.out.println("请输入你的工资");
        int fee = s.nextInt();
        Graduate zhangsan = new Graduate(pay,fee);
        if(zhangsan.getFee() - zhangsan.getPay() < 2000){
            System.out.println("you need a loan");
        }else {
            System.out.println("you income is  enough");
        }
    }
}

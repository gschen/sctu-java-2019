package lab_02;

import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("请输入一个值：");

        try {
            int a = sc.nextInt();
        }catch (Exception e){
            System.out.println("输入值不是int值");
        }finally {

        }

    }
}

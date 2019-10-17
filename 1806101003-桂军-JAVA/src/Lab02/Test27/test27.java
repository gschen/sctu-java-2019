package Lab02.Test27;

import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        System.out.println("输入数值");
        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
        }catch (Exception e){
            System.out.println("请输入int类型的数值");
        }
    }
}

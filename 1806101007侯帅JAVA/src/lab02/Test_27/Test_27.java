package lab02.Test_27;

import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个int类型的数：");
        int i;//定义一个整数i
        try {
            i = scanner.nextInt();//输入的数为整数;相当于把输入的值赋值给i
        }catch (Exception e){
            System.out.println("发生异常");
        }
        finally {

        }

    }
}


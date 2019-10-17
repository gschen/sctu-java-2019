package lab02.Test_27;

import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输一个int类型的的数：");
            int a = scanner.nextInt();    //输入一个int类型的数
            System.out.println("这个数是：" + a);
        }
        catch (Exception e) {
            System.out.println("输入数据类型错误！");
            System.out.println(e.toString());
        }
        finally {
        }
    }
}

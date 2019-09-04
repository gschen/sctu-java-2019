package Practice;

import java.util.Scanner;

public class Test_0901 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("请输入要计算的值，间隔为回车，结束请按q");
        double sum = 0;
        int m = 0;
        while (Scan.hasNextDouble()){
            double x = Scan.nextDouble();

            m = m +1;
            sum = x + 1;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值为"+sum/m);
    }
}

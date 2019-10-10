package lab_02.Test_25;

import java.util.Scanner;

public class Test_25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        try {
            System.out.println(divide(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static double divide(double a,double b) throws Exception {
            if (b==0){
                Exception e=new Exception("除数为零");
                throw e;
            }
            return a/b;
    }
}

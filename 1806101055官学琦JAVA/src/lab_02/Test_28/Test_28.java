package lab_02.Test_28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("请输入圆的半径：");
            double r=scanner.nextDouble();
            System.out.println("圆的面积为："+r*r*3.14);
        }catch (InputMismatchException e){
            System.out.println("你输入的类型错误");
        }

    }
}

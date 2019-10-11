package src.lab_02.Test_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan_input = new Scanner(System.in);
            System.out.println("请输入圆的半径（double）");
            double a = scan_input.nextDouble();
            System.out.println("圆的面积为："+a*a*3.14);
        }catch (Exception e){
            System.out.println("输入错误");
        }

    }
}

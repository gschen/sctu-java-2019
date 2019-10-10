package lab02.Test_28;

import java.util.Scanner;

public class Test_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r;//定义一个double类型的变量、
        try {
            r = scanner.nextDouble();//输入的数为double类型的时候把值赋给r；
            double s= Math.PI*r*r;
            System.out.println(s);
        }catch (Exception e){
            System.out.println("你输入的数不是double类型的");//当输入的数不是double类型的时候就会捕捉错误

        }finally {

        }
    }
}

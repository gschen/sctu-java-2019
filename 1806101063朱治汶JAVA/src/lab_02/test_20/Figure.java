package lab_02.test_20;

import java.util.Scanner;

public class Figure {

    public static void main(String[] args) {
        //用户输入值
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一行含有数字和字符的字符串：");
        String a = sc.next();

        String b = "";
        for (int i = 0; i < a.length(); i++) {

            //48-57为0-9的数字

            if (a.charAt(i)<48){
                continue;
            }
            if (a.charAt(i)>57){
                continue;
            }
            else
                b = b + a.charAt(i);
        }
        System.out.println("输出的数字为："+b);
    }
}

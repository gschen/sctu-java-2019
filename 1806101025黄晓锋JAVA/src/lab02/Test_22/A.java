package lab02.Test_22;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String a = sc.next();

        String b = "";

        for (int i = 0; i <a.length() ; i++) {

            //65-90为26个大写英文字母
            //97-122为26个小写英文字母


            if (a.charAt(i)<=90 && a.charAt(i)>=65){
                b =b + (char) (a.charAt(i)+32);
            }
            if (a.charAt(i)>=48 && a.charAt(i)<=57){
                b = b + "0";
            }
            else
                b = b + "#";
        }
        System.out.println("输出结果为："+b);
    }
}

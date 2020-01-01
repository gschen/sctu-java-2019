package lab_02.Test_20;

import java.util.Scanner;

//20、 	编写一个应用程序，用户从键盘输入一行含有数字和字符的字符串，程序仅仅输出字符串中的全部数字字符。
public class Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String aa = sc.next() ;
        char ch;
        for (int i = 0; i < aa.length(); i++) {
            ch = aa.charAt(i);
            if((int)ch < 58 & ch>47)
                System.out.print((char)ch);
        }
    }
}
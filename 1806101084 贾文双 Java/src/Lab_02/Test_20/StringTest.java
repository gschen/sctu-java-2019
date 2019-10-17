package Lab_02.Test_20;

import java.util.Scanner;

//20、 	编写一个应用程序，用户从键盘输入一行含有数字和字符的字符串，程序仅仅输出字符串中的全部数字字符
public class StringTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入带数字字符串：");
        String str = s.next();
        System.out.println((str.replaceAll("\\D"," ")).replaceAll(" ",""));
    }
}

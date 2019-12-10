package lab_02.Test_21;
//21、 	统计一个字符串中给定字符出现的频率。

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string = scanner.next();
        System.out.println("请输入查询字符：");
        char find = scanner.next().charAt(0);
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(ch == find)num++;
        }
        System.out.print(num);
    }
}

package lab02.Test_20;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符：");

        while (input.hasNext()){
            String a = input.next();
            System.out.println(a.replaceAll("\\D",""));//把字符串中的非数字全部替换为"" 打印
        }
        input.close();
    }
}

package lab_02;

import java.util.Scanner;

public class Test_20 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符：");

        while (input.hasNext()) {
            String a = input.next();
            System.out.println(a.replaceAll("\\D",""));

        }
        input.close();
    }
}

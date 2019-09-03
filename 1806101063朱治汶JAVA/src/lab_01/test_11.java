package lab_01;

import java.util.Scanner;

public class test_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1—9999的数字：");
        int a = sc.nextInt();
        int e = a;

        int j = 1;
        while (a >= 10){
            a = a / 10;
            j++;
        }
        System.out.println("输入的数字位数为："+j);

        String b = String.valueOf(e);
        int c = b.length();

        boolean d = false;
        for (int i = 0; i <= c/2 ; i++) {
            if (b.charAt(i) != b.charAt(c - i )){
                d = false;
                break;
            }
            else
                d = true;
        }
        if (d == false){
            System.out.println("不是回文");
        }
        else
            System.out.println("是回文");


    }
}

package lab_02.Test_21;

import java.util.Scanner;

public class Test_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=input.next();
        int str_num=str.length();
        System.out.println("请输入需要统计的字符串：");
        String s=input.next();
        String strs=str.replaceAll(s,"");
        int strs_num=strs.length();
        System.out.println(s+"出现的次数为："+(str_num-strs_num)/s.length()+"次");
    }
}

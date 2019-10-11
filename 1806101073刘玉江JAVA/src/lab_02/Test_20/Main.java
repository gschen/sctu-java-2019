package lab_02.Test_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入一个含有数字的字符串：");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str);
        str = str.trim();
        String str2 = " ";
        if (str != null && !"".equals(str)){
            for (int i = 0; i<str.length();i++){
                if (str.charAt(i)>=48 && str.charAt(i) <=57 ){
                    str2+=str.charAt(i);
                }
            }
        }
        System.out.println(str2);
    }
}

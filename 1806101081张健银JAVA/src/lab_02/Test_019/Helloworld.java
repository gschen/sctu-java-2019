package lab_02.Test_019;


import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] a = str.toCharArray();
        StringBuffer buffer =new StringBuffer();//创建空数组
        for (int i = a.length - 1; i > 0 ; i--) {
            if(a[i] >= 'A' && a[i] <= 'Z'){
                buffer.append(String.valueOf(a[i]).toLowerCase());
            }else if(a[i] >= 'a' && a[i] <= 'z'){
                buffer.append(String.valueOf(a[i]).toUpperCase());
            }
        }
        System.out.println(buffer.toString());
    }

}

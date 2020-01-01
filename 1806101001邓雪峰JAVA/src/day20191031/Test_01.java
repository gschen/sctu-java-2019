package day20191031;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Test_01 {
    public static void way1(String str){
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse());

    }

    public static  void way2(String str){
        char[] adc = str.toCharArray();
        for (int i=adc.length;i>0;i--){
            System.out.print(adc[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入文本");
        Scanner str = new Scanner(System.in);
        String ad = str.next();
        way1(ad);
        //way2(ad);//存在错误面对变量要求严格

    }
}

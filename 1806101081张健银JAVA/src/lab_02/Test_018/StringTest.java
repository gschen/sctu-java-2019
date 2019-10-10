package lab_02.Test_018;
//1）声明一个名为name的String对象，内容是“My name is Network crazy”； 2）打印字符串的长度；
//        3）打印字符串的第一个字符；
//        4）打印字符串的最后一个字符；
//        5）打印字符串的第一个单词；
//        6）打印字符串crazy的位置（从0开始编号的位置）。

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串的长度是：" + name.length());
        name.charAt(0);//获取指定索引下的字母
        name.charAt(name.length()-1);
        name.indexOf('M');//获取当前元素的下标
        System.out.println(name.split(" "));
        String[] words = name.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(name.indexOf("crazy"));//返回该单词第一次出现的下标
        System.out.println(name.trim());//去掉字符串两端的空格
    }
}

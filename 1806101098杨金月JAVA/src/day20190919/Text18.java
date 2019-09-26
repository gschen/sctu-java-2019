package day20190919;

public class Text18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度"+name.length());//返回字符长度

       // 打印字符串的长度；
        // 3）打印字符串的第一个字符；
        // 4）打印字符串的最后一个字符；
        // 5）打印字符串的第一个单词；
        // 6）打印字符串crazy的位置（从0开始编号的位置）。


        name.charAt(0);//获得下标为0的。

        name.charAt(name.length()-1);//获得最后一个字符。

        name.indexOf('M');//获得第一次出现M字符的下标。返回值类型为Int
        name.indexOf("crazy");//返回单词的下标

        //分割
       String[] words = name.split(" ");//返回以 来分割的。 返回值类型为String 数组，及字符串数组


        System.out.println(name.indexOf('M'));


    }
}
//ctrl+d 看别人写好的代码。
package lab_02.Test_18;
/*18、 	编写一个Java程序，完成以下功能：
        1）声明一个名为name的String对象，内容是“My name is Network crazy”；
        2）打印字符串的长度；
        3）打印字符串的第一个字符；
        4）打印字符串的最后一个字符；
        5）打印字符串的第一个单词；
        6）打印字符串crazy的位置（从0开始编号的位置）。*/

public class Name {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度："+ name.length());
        System.out.println("第一个字母" + name.charAt(0));
        System.out.println("最后一个字母" + name.charAt(name.length()-1));
        System.out.println("M的位置" + name.indexOf("M"));
        //String[] words = name.split(" ");
        //System.out.println(words);
        System.out.println("crazy的位置" + name.indexOf("crazy"));
        System.out.println(name.trim());

    }
}

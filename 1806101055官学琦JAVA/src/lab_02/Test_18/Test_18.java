package lab_02.Test_18;

public class Test_18 {
    public static void main(String[] args) {
        String name="My name is Network crazy";
        //打印字符串长度
        System.out.println(name.length());
        //打印第一个字符
        System.out.println(name.charAt(0));
        //打印第一个单词
        System.out.println(name.substring(0,name.indexOf(" ")));
        //打印最后一个单词
        System.out.println(name.substring(name.lastIndexOf(" ")+1,name.length()-1));
        //打印字符串crazy的位置
        System.out.println(name.indexOf("crazy"));
    }
}

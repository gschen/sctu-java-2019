package Lab02.Test18;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度：" + name.length());
        System.out.println("第一个字符：" + name.charAt(0));
        System.out.println("最后一个字符：" + name.charAt(name.length() - 1));
        System.out.println("某字符的下标：" + name.indexOf('M'));
        System.out.println("以空格来分割后" + name.split(" "));//结果为字符串数组
        String[] words = name.split(" ");
    }
}

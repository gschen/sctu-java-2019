package lab_02.Test_18;

public class StringTest {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度： " + name.length());
        System.out.println("第一个字符为： " + name.charAt(0));
        System.out.println("最后一个字符为： " + name.charAt(name.length() - 1));
        String [] words =  name.split(" ");
        System.out.println("第一个单词为： " + words[0]);
        System.out.println("crazy的位置是: " + name.indexOf("crazy"));
    }
}

package lab_02;

public class Name {
    public static void main(String[] args) {
        String name="My name is Network crazy";
        System.out.println("字符串长度为："+name.length());
        System.out.println("字符串德第一个字符为："+name.charAt(0));
        System.out.println("字符串最后一个字符为："+name.charAt(name.length()-1));
        System.out.println("字符串crazy的位置："+name.indexOf("crazy"));
    }
}

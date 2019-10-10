package day20190919;

public class Test_18 {
    public static void main(String[] args) {
        String name="My name is Network crazy";
        System.out.println("字符长度："+name.length());
        name.charAt(0);
        name.charAt(name.length()-1);
        name.indexOf('M');//获得所有M字符的下标
        name.indexOf("crazy");
        String[] words= name.split(" ");//返回字符串数组
        name.trim();
    }
}

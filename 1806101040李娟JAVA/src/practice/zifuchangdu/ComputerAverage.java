package practice.zifuchangdu;

public class ComputerAverage {
    public static void main(String[] args) {
        String name = "My name is Network crazy";

        System.out.println("字符串长度：" + name.length());// name.length()

        name.charAt(0);

        name.charAt(name.length() - 1);

        name.indexOf('M');      //一个字母 单引号
        name.indexOf("crazy");  //一个单词 双引号

        String[] words= name.split(" ");

        System.out.println(name.indexOf("crazy"));
    }
}

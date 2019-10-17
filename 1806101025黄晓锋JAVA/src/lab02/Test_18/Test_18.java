package lab02.Test_18;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is NetWork crazy";

        name.length();
        System.out.println("字符串长度：" + name.length());

        name.charAt(0);
        System.out.println("第一位：" + name.charAt(0));

        name.charAt(name.length() - 1);
        System.out.println("最后一位：" + name.charAt(name.length() - 1));

        name.indexOf('M');
        name.indexOf("crazy");
        System.out.println("第一次出现M的下标：" + name.indexOf('M'));
        System.out.println("单词crazy第一次出现的下标：" + name.indexOf("crazy"));

        String[] words = name.split(" ");

    }
}

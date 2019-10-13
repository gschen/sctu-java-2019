package lab_02;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        name.length();

        System.out.println("字符串长度："+name.length());

        System.out.println("返回name中的第一个字母"+name.charAt(0));
        //返回最后一个字母
        System.out.println(name.charAt(name.length() - 1));

        //寻找索引
        System.out.println(name.indexOf("M"));
        //单词第一次出现的下标
        name.indexOf("crazy");

        String[] words = name.split(" ");
    }
}

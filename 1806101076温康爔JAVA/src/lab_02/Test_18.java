package lab_02;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度：" + name.length());
        name.charAt(0);
        name.charAt(name.length() - 1);
        name.indexOf('M');
        name.indexOf("crazy");
        name.split(" ");//split分割
        String[] words=name.split(" ");//返回字符串数组

    }
}

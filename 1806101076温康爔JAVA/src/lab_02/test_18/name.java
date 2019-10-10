package lab_02.test_18;

public class name {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度：" + name.length());
        name.charAt(0);//字符串的第一个字符
        name.charAt(name.length() - 1);//字符串的最后一个字符
        System.out.println("字符串第一个字符："+name.charAt(0));
        System.out.println("字符串最后一个字符："+name.charAt(name.length()-1));
        //name.indexOf('M');//获取当前元素的下标
        name.indexOf("crazy");
        System.out.println("字符串crazy的位置为："+name.indexOf("crazy"));//返回该单词第一次出现的下标
        //name.split(" ");//split分割
        //String[] words=name.split(" ");//返回字符串数组
        //System.out.println(name.split(" "));
    }
}

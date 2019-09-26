package day20190919;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串长度： " + name.length());
        System.out.println("第一个字符为： " + name.charAt(0)); //charAt 获得对应下标的char
        System.out.println("最后一个字符为： " + name.charAt(name.length() - 1));
        System.out.println("第一个单词为： " + name.split(" "));
        name.indexOf("My");  //返回第一个M的下标
        name.indexOf("crazy");//返回单词crazy第一次出现的下标



        String[] words = name.split("1"); //以" "中间的内容把name分隔开,返回值类型为字符串数组
    }
}

package lab02.Test_18;

public class Test_18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        System.out.println("字符串的长度："+name.length());
        System.out.println("第一个字符是："+name.charAt(0));//chart（）函数，获得具体位置的字符
        name.indexOf("M");//获得M字符或者一个字符串的下标
       String [] words =  name.split(" ");//以空格来分割整个字符串
        System.out.println("最后一个字符是："+name.charAt(name.length()-1));
        System.out.println("第一个单词是："+words[0]);
        System.out.println("crazy的位置是"+name.indexOf("carzy"));


    }
}

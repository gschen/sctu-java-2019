package lei1.number11math;

//String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
public class Str {
//    public static void main(String[] args) {
//        char[] helloArray = {'r' , 'u' , 'o' ,'o'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//    }

//   字符串长度
//public static void main(String[] args) {
//    String s = "www.baidu.com哈";
//    int len = s.length();
//    System.out.println("百度网址长度："+ len); //长度 加上了标点符号 于长度而言 一个汉字也是一个长度
//}

//连接字符串（更常用的是用加号来连接）（用contact 也行  "我的名字是 ".concat("Runoob");）
//    public static void main(String[] args) {
//        String s1 = "重要的是：";
//        System.out.println("1、" + s1 + "喜欢自己比喜欢世界更重要");
//}


// 用 StringBuffer 对字符串进行多次修改   （由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用
// StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。）
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("百度网址：");
        s1.append("www");  // append 增加
        s1.append(".baidu");
        s1.append(".com");
        System.out.println(s1);
    }


}



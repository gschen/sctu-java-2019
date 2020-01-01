package day20191210;

public class Test_02 {
    public static void main(String[] args) {
        String str = "hello World";
        String anotherString ="Hello world";
        //int a = 10;
        Object object = str;//对象
        //object是一个存储对象，可以将任何数据类型存储于在object中，存储在object中的数据将会转换为object类型，而不是其他，object.toString()将存储的内容以字符串的形式输出出来！

        System.out.println( str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));//不区分大小写进行匹配
        //str.compareTo是字符串自带的匹配方法，将字符串中出现的第一个不同的字符的ASII值的差值返回出来，只能返回第一个不匹配的地方，全部匹配返回0
        System.out.println(str.compareTo(object.toString()));
        //System.out.println(object.toString());
        //System.out.println(object.toString() instanceof String);
    }
}

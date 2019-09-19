package day20190919;

/**
 * Created by Administrator on 2019-9-19.
 */
public class Test_18 {

    public static void main(String[] args) {


        String name = "My name is Network crazy";

        System.out.println("字符串长度： " + name.length());

        name.charAt(0);

        name.charAt(name.length() - 1);

        name.indexOf('M');
        name.indexOf("crazy");

        String[] words = name.split(" ");

        name.trim();



    }
}

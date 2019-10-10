package lab_02.test_31;


import java.util.ArrayList;
import java.util.List;


public class ListTest {
    public static void main(String[] args) {
        int a = 9;

        ///保存10个整数 0 - 9
        //1.数组
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;

        String[] ss = new String[5];
        ss[0] = "hello";
        ss[1] = "world";


        //list集合

        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");

    }

}

package day20190919;

import java.util.ArrayList;
import java.util.List;

public class test_18 {


    public static void main(String[] args) {
        String name="My name is Network crazy";
        System.out.println(name.length()+"   首字符："+name.charAt(0)+"   尾字符："+name.charAt(name.length()-1));
        System.out.println(name.split(" ")[0]);
        System.out.println(name.indexOf("crazy"));
    }
}

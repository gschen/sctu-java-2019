package lab_02.Test_31;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.print.DocFlavor;
import java.util.*;


public class main {
    public static void main(String[] args) {
        int a =9;
        //保存10个整数0-9
        //1.数组
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;
        //...
        ints[9] = 9;
        String[] ss = new String[5];
        ss[0] = "hello";
        ss[1] = "world";
        ss[2] = "crazy";
        ss[3] = "word";
        ss[4] = "phi";
        //List集合
        //泛型
        List<String > list = new ArrayList<String >();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        System.out.println(list);
        for (String s:list){
            System.out.println(s);
        }

        Set<String > myset = new HashSet<String >();
        myset.add("ssss");
        myset.add("sses");
        System.out.println(myset);
        for (String s : myset){
            System.out.println(s);
        }
        /**
         * url:https://www.baidu.com
         * port:80
         * protocol:http
         * key :value
         */
        Map<String ,String>map =new HashMap<String ,String>();
        map.put("url","https://www.baidu.com");
        map.put("port","80");
        map.get("url");
        map.get("port");
        System.out.println(map.get("url"));


    }
}

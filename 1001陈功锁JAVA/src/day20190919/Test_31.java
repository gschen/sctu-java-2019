package day20190919;

import java.util.*;

/**
 * Created by Administrator on 2019-9-19.
 */
public class Test_31 {


    public static void main(String[] args) {

        int a = 9;

        // 保存10个整数 0 - 9
        // 1. 数组
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;
        //....
        ints[9] = 9;

        String[] ss = new String[5];
        ss[0] = "hello";
        ss[1] = "world";
        ss[2] = "crazy";
        ss[3] = "word";
        ss[4] = "phi";

        // List集合
        // 泛型
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");

        for (String s : list){

            System.out.println(s);
        }


        Set<String> myset = new HashSet<String>();
        myset.add("hello");
        myset.add("world");
        myset.add("world");

        for (String s : myset){
            System.out.println(s);
        }


        /**
         * url: http://www.baidu.com
         * port: 80
         * protocol: http
         *
         * key : value
         */
        Map<String, String> map =
                new HashMap<String, String>();
        map.put("url", "http://www.baidu.com");
        map.put("port", "80");

        map.get("url");
        map.get("port");

        for(Map.Entry<String, String> entry : map.entrySet()){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }






        // ctrl + b
        // ctrl + h
        // alt + enter
    }
}

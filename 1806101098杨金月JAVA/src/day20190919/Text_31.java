package day20190919;

import java.util.*;

public class Text_31 {
    public static void main(String[] args) {
        //保存十个整数0-9
        //1 数组
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;
        //..
        ints[9] = 9;

        String[] ss = new String[5];
        ss[0] = "hello";
        ss[1] = "pk";
        ss[2] = "nice";
        ss[3] = "ok";
        ss[4] = "yes";

        //List集合
        //<String>泛型
        List<String>list = new ArrayList<String>();
        list.add("hellok");
        list.add("helloh");
        list.add("hellof");
        list.add("hellod");
        list.add("hellos");
        list.add("helloy");
        list.add("helloe");
//打印List
        for (String s :list){
            System.out.println(s);

        }


        Set<String> myset = new HashSet<String>();//Set可以保证集合里面的元素都是唯一的。
        myset.add("helloll");
        myset.add(("word"));
        myset.add(("word"));//两个word只打印一个。

        for (String s :myset){
            System.out.println(s);

        }


        /**
         * url:http//www.baidu.com
         * port:80
         * protocol:http
         *
         * key:value(数据的格式)
         */
        Map<String,String> map = new HashMap<String,String>();
        map.put("url","http//:www.baidu.com");
        map.put("port","80");

        map.get("url");
        map.get("port");

        for (Map.Entry<String,String>entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }





    }
}

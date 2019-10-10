package lab_02.day20190919;

import java.util.*;

public class Test_31 {
    public static void main(String[] args) {
        int a = 9;
        //保存是个整数 0 - 9
        //1.数组
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;
        //......
        ints[9] = 9;
        String[] ss = new String[5];
        ss[0] = "hello";
        ss[1] = "world";
        ss[2] = "crazy";
        ss[3] = "world";
        ss[4] = "wc";

        //list 集合
        //  <> 表示泛型
        List<String> list = new ArrayList<String>();
        list.add("world");
        list.add("world");
        list.add("world");
        list.add("world");
        for (String s : list){
            System.out.println(s);
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("url","http://www.baidu.com");
        map.put("put","80");
        map.get("url");
        map.get("port");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //ctrl + b 查看类
        Set<String> myset = new HashSet<String>();
    }
}

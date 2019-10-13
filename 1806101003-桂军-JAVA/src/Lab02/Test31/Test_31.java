package Lab02.Test31;

import java.util.*;

public class Test_31 {
    public static void main(String[] args) {
        String[] ss = new String[5];
        ss[0] = "hello";


    //list集合
        //泛型
        List<String> list = new ArrayList<String>();
        list.add("word");
        list.add("四川旅游学院");
        for (String s : list){//打印集合里面的元素
            System.out.println(s);
        }


        Set<String> myset = new HashSet<String>();
        myset.add("hellow");
        myset.add("word");

        Map<String,String> map =
                new HashMap<String, String>(0);
        map.put("url","http://www.baidu.com");
        map.get("url");
        map.get("port");

        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}

package lab_02.test_31;

import java.util.*;


public class Test31 {
    public static void main(String[] args) {
        int a=9;
        //保存10个整数0-9
        //1.数组
        int[] ints=new int[10];
        ints[0]=0;
        ints[1]=1;
        //......
        ints[9]=9;
        String[] ss=new String[5];
        ss[0]="hello";
        ss[1]="world";
        ss[2]="crazy";
        ss[3]="word";
        ss[4]="dl";

        //list集合
        List<String> name = new ArrayList<>();//list添加元素不唯一
        list.add("hello");
        list.add("dl");
        list.add("dl");

        //ctrl+b
        //ctrl+h
        //alt+enter

        Set<String> myset=new HashSet<String>();//set添加元素唯一
        myset.add("hello");
        myset.add("dl");

        for (String s:name){
            System.out.println(s);
        }

        Map<String,String> map=new HashMap<String, String>();//map查询
        map.put("url","http://www.baidu.com");

        map.get("url");
        map.get("port");

        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }
}

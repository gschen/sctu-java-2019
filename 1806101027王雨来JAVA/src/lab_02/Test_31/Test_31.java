package lab_02.Test_31;

import java.util.*;

public class Test_31 {
    public static void main(String[] args) {
        int a = 9;
        //保存10个整数
        int[] ints = new int[9];
        for (int i = 0; i < 9; i++) {
            ints[i] = i;
        }
        System.out.println(ints);

        //List集合来保存数据
        //泛型
        List<String> list = new ArrayList<String>();
        list.add("nb1");
        list.add("nb2");
        list.add("nb3");
        list.add("nb4");
        list.add("nb5");
        list.add("nb6");

        System.out.println(list);
        //ctrl+ h/b    alt+enter

        for (String s:list){
            System.out.println(s);
        }
        Set<String> myset = new HashSet<String>();

        Map<String,String> map = new HashMap<String, String>();
        map.put("键","值");
        map.put("url","http://39.134.202.245:1");

        System.out.println(map.get("url"));
        for (Map.Entry<String,String>entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


}

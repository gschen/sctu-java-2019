package lab02.Test_32;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_32 {
    public static void main(String[] args) {
        Map<String,String> people = new HashMap();
        people.put("id","1");
        people.put("name","张三");
        people.put("gender","男");
        people.put("age","25");
        people.put("love","爱学java");
        System.out.println(people);
        for (Map.Entry<String, String> m:people.entrySet()){
            System.out.println(m);//MAP集合的遍历
        }
        System.out.println("集合的大小是："+people.size());
        System.out.println("删除的内容是："+people.remove("age"));
        System.out.println("集合目前的大小是："+people.size());
    }
}

package lab_02.Test_32;

import java.util.HashMap;
import java.util.Map;

public class Test_32 {
    public static void main(String[] args) {
        Map<String,String> person = new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","学习java");

        for (Map.Entry<String,String>m:person.entrySet()){
            System.out.println(/*"属性" +*/ m.getKey() + ":" + m.getValue());
        }

        System.out.println(person.size());
        person.remove("age");
        System.out.println(person.remove("age"));
        System.out.println(person.size());
    }
}

package src.lab_02.Test_32;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String,String>person = new HashMap<String,String>();
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱Java");
        for (Map.Entry<String,String>entry:person.entrySet()){
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }
        System.out.println(person.size());
        person.remove("age");
        System.out.println(person.size());
    }
}

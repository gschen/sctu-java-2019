package lab02.Test_32;

import java.util.HashMap;
import java.util.Map;

public class Test_32 {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<String, String>();
        person.put("id:", "1");
        person.put("name:", "张三");
        person.put("gender:", "男");
        person.put("age:", "25");
        person.put("love:", "爱学Java");

        person.get("id:");
        person.get("name:");
        person.get("gender:");
        person.get("age:");
        person.get("love:");

        for (Map.Entry<String, String> entry1 : person.entrySet()) {
            System.out.print(entry1.getKey());
            System.out.println(entry1.getValue());
        }

//        for (String x : person.keySet()) {
//            System.out.println(x);
//            if (x == "age:") {
//                try {
//                    person.remove("age:");
//                }
//                catch (ConcurrentModificationException e) {
//                    System.out.println("当前修改错误！");
//                }
//                finally {
//
//                }
//            }
//        }

        for (Map.Entry<String, String> entry2 : person.entrySet()) {
            System.out.print(entry2.getKey());
            System.out.println(entry2.getValue());
        }
        System.out.println(person.get("gender:"));
        System.out.println(person.get("love:"));
    }
}

package lab_02;

import java.util.HashMap;
import java.util.Map;

public class Test_32 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "黄晓峰");
        map.put("2", "黄哈儿");

        map.get("1");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

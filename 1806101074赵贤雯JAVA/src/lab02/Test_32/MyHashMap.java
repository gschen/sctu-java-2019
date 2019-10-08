package lab02.Test_32;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    //	创建一个只能值只能容纳String对象的person的HashMap集合
    public static void main(String[] args) {
        new MyHashMap();
    }
    MyHashMap(){
        Map<String, String> Person = new HashMap<>();
        Person.put("id", "001");
        Person.put("name", "张三");
        Person.put("sex", "男");
        Person.put("age", "28");
        Person.put("love", "我爱JAVA");

    // 对集合进行遍历，分别打印集合中每个元素的位置和内容
        System.out.println("id---->" + Person.get("id"));
        System.out.println("name---->" + Person.get("name"));
        System.out.println("sex---->" + Person.get("sex"));
        System.out.println("age---->" + Person.get("age"));
        System.out.println("love---->" + Person.get("love"));
        System.out.println("改变前容器的大小为：" + Person.size());
        System.out.println("删除的值为：" + Person.remove("age"));
        System.out.println("改变后容器的大小为：" + Person.size());

    }
}

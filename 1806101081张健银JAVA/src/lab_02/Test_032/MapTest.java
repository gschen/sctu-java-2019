package lab_02.Test_032;
//32、 	编写程序练习Map集合的基本使用：
//        1）	创建一个只能值只能容纳String对象的person的HashMap集合；
//        2）	往集合中添加5个“键－值”对象：id—>"1"、name—>"张三"、gender—>"男"、 age—>"25"、love—>"爱学Java"；
//        3）	对集合进行遍历，分别打印集合中的每个元素的键与值；
//        4）	首先打印集合的大小，然后删除集合中的键为age的元素，并显示删除元素的内容，并再次打印集合的大小。

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> person = new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱学java");

//        for (Map.Entry<String,String> entry:person.entrySet()) {
//            System.out.println(entry.getKey()+entry.getValue());
//        }
        Iterator<Map.Entry<String,String> > iterator = person.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("键为："+ entry.getKey() + "======" + "值为：" + entry.getValue());
        }

        System.out.println("person大小为："+person.size());
        String str = person.remove("age");
        System.out.println("删除内容为"+str);
        System.out.println("现在集合大小为："+person.size());
    }
    
}

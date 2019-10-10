package lab_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test_32 {
    public static void main(String[] args) {
        Map<String,String> person = new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱学java");

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

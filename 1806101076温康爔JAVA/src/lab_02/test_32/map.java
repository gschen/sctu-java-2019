package lab_02.test_32;

import java.util.Map;//映射，将键映射到值
import java.util.HashMap;//哈希映射，提供所有可选的映射操作，并允许使用 null 值和 null 键
import java.util.Iterator;//迭代器

public class map {
    public static void main(String[] args) {
        Map<String,String> person=new HashMap<String, String>();
        System.out.println("下面是集合的所有元素：");
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱学java");
        for (Iterator<java.util.Map.Entry<String,String>>
             iter=person.entrySet().iterator();iter.hasNext();){
            Map.Entry entry=(Map.Entry) iter.next();
            System.out.println("键："+entry.getKey()+"-->值"+entry.getValue());
        }
        System.out.println("目前集合的大小为："+person.size());
        System.out.println("删除的键age的内容为："+person.get("age"));
        person.remove("age");
        System.out.println("删除操作后，集合的大小为："+person.size());
    }
}

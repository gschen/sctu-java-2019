package lab_02.Test_32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_32 {
    public static void main(String[] args) {
        Map<String,String> person=new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("sex","男");
        person.put("age","25");
        person.put("love","爱学 java");
        //Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在set集合中,Iterator迭代器
        Iterator<Map.Entry<String,String>> iterator=person.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println("person大小为："+person.size());
        String str = person.remove("age");
        System.out.println("删除内容为"+str);
        System.out.println("现在集合大小为："+person.size());
    }
}

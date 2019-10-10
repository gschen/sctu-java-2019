package lab_02.test_31;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("张三");
        name.add("李四");
        name.add("王五");
        name.add("马六");
        name.add("赵七");
        for (int i=0;i<name.size();i++){
            System.out.println("位置："+i+"的元素内容为："+name.get(i));
        }
        System.out.println("集合大小为："+ name.size());
        System.out.println("删除第3个元素内容为："+name.get(2));
        name.remove(2);
        System.out.println("删除操作后，集合的第3个元素为："+name.get(2));
        System.out.println("删除操作后，集合的大小为："+name.size());

    }

    public static void add(String hello) {
    }
}

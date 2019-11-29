package Lab_02.Test_031;
//31、 	编写程序练习List集合的基本使用：
//        1)	创建一个只能容纳String对象名为names的ArrayList集合；
//        2)	按顺序往集合中添加5个字符串对象：“张三”、“李四”、“王五”、“马六”、“赵七”；
//        3)	对集合进行遍历，分别打印集合中的每个元素的位置与内容；
//        4)	首先打印集合的大小，然后删除集合中的第3个元素，并显示删除元素的内容，然后再打印目前集合中第3个元素的内容，并再次打印集合的大小。

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("张三");
        name.add("李四");
        name.add("王五");
        name.add("马六");
        name.add("赵七");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("集合大小为:"+ name.size());
        String name3 = name.remove(2);
        System.out.println("删除元素为"+name3);
        System.out.println("前集合中第3个元素"+name.get(2));
        System.out.println(name.size());
    }

}

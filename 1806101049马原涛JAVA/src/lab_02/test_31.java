package lab_02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test_31 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("马三");
        name.add("马四");
        name.add("马五");
        name.add("马六");
        name.add("马七");
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

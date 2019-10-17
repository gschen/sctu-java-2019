package lab_02.Test_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_34 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");

        System.out.println("最大值为:"+Collections.max(list));
        System.out.println("最小值为:"+Collections.min(list));

        System.out.println("排序后结果为：");
        Collections.sort(list);
        for (String a:list){
            System.out.println(a);
        }
    }
}

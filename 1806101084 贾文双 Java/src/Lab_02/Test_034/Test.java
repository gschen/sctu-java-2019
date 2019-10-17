package Lab_02.Test_034;
//34、 	在一个列表中存储以下元素：apple, grape, banana, pear
//        1)	返回集合中的最大的和最小的元素；
//        2)	将集合进行排序，并将排序后的结果打印在控制台上。

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        System.out.println("最大值为：" + Collections.max(list) + "最小值为：" + Collections.min(list));

        Collections.sort(list);
        System.out.println(list);
    }
}

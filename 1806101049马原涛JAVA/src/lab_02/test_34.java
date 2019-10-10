package lab_02;
//34、 在列表中存储：apple, grape, banana, pear
// 返回集合中最大和最小的元素；
// 集合排序，并将结果打印

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_34 {
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

package lab_02.test_34;

import java.util.Collections;//集合接口
import java.util.LinkedList;//序列化，和ArrayList不同的是它是链表结构，而ArrayList是顺序结构

public class list {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("apple");
        link.add("grape");
        link.add("banana");
        link.add("pear");
        System.out.println("最大的元素为"+Collections.max(link));
        System.out.println("最小的元素为"+Collections.min(link));

        Collections.sort(link);
        for(String s :link){
            System.out.println(s);
        }
    }
}


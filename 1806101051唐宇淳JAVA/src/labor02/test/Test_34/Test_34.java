package labor02.test.Test_34;

import java.util.*;

public class Test_34 {
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





//        Collections.sort(list, new Comparator<String>() {
//@Override
//public int compare(String o1, String o2) {
//        return o1.compareToIgnoreCase(o2);
//        }
//        });
//        System.out.println("排序后的列表为："+list);
//        }

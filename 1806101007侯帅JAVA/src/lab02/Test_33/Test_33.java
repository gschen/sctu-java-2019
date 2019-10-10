package lab02.Test_33;

import java.util.*;

public class Test_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入单词：");
        String s = sc.nextLine();
        String[] s2 = s.split(" ");
       //list.subList()截取从某个元素到某个元素之间的所有元素
        List<String> list = new ArrayList<>();
        for (int i = 0; i <s2.length ; i++) {
            list.add(s2[i]);//每一次添加s2中的一个元素进入list
        }
        Collections.sort(list, new Comparator<String>() {//排序
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);//排序
            }
        });
        System.out.println(list);
        System.out.println(list.size());
    }
}

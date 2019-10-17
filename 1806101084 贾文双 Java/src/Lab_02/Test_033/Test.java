package Lab_02.Test_033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//33、 	从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("请输入若干个单词");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           String string = s.next();
           list.add(string);
        }


        Collections.sort(list);
        System.out.println(list);
    }
}

package lab_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test_33 {
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

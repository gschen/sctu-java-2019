package lab_02.Test_34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_34 {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("apple");
        ls.add("grape");
        ls.add("banana");
        ls.add("pear");
        System.out.println(Collections.max(ls)+"\n"+Collections.min(ls));//Collections.sort是排序，
        Collections.sort(ls);
        System.out.println(ls);
    }
}

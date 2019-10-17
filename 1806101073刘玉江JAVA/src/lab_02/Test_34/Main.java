package src.lab_02.Test_34;

import java.sql.Connection;
import java.util.*;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }
    }
}

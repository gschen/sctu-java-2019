package lab_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_21 {

    public static void main(String[] args) {

        List<String> strs = new ArrayList<>();
        strs.add("weqeqw");
        strs.add("twrwrqwe");

        Map<Character, Integer> wordCount = new HashMap<Character, Integer>();
        for (String str : strs) {
            for (int i = 0; i < str.length(); i++) {
                if (wordCount.containsKey(str.charAt(i))) {
                    wordCount.put(str.charAt(i), wordCount.get(str.charAt(i)) + 1);
                } else {
                    wordCount.put(str.charAt(i), 1);
                }
            }
        }

        System.out.println(wordCount);

    }}
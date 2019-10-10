package lab_02.test_34;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        String[] str = {"apple","grape","banana","pear"};

        List<String> lis= Arrays.asList(str);

        Collections.sort(lis,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println(lis.get(0));
        System.out.println(lis.get(3));
        System.out.println(lis);
    }

}

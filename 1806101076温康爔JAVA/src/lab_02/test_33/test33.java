package lab_02.test_33;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test33 {
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        String  str=s.nextLine();
        String [] st=str.split(" ");
        //Arrays.asList(st);
        List<String> lis=Arrays.asList(st);
        Collections.sort(lis,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.print(lis);
    }
}

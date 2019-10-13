package lab_02;

import java.util.*;

public class Test_33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入数组：");
        String  str=s.nextLine();


        String [] st=str.split(" ");
        //Arrays.asList(st);
        List<String> li= Arrays.asList(st);
        Collections.sort(li,new Comparator<String>() {

            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.print(li);
    }
}

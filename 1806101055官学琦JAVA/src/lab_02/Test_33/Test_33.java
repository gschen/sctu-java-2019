package lab_02.Test_33;

import java.util.*;

public class Test_33 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            String strs=scanner.next();
            list.add(strs);
        }
        System.out.println(list);
    }
}

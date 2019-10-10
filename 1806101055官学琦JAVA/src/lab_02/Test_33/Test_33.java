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
        Collections.sort(list);
        System.out.println(list);
    }
}

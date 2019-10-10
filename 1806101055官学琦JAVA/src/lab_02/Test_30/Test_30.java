package lab_02.Test_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int j=scanner.nextInt();
            list.add(j);
            sum=sum+j;
        }
        System.out.println(list.size());
        System.out.println(sum/list.size());
    }
}

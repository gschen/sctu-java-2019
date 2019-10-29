package week_1;

import java.util.Scanner;

public class TEst_2_14 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 1000; i++) {
            boolean flag = false;
            for (int j = 2; j <= 1000; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                sum += 1;
                System.out.println(i);
            }
        }
        System.out.println();
    }
}

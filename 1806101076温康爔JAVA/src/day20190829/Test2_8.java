package day20190829;

import static java.lang.System.*;

public class Test2_8 {
    public static void main(String args[]) {
        int n = 10, m = 5;
        System.out.println("for循环求解下结果=" + sum1(n, m));
        System.out.println("while循环求解下结果=" + sum2(n, m));
        System.out.println("do while循环求解下结果=" + sum3(n, m));
    }

    public static long sum1(int n, int m) {
        int i = 0;
        long sum = 0;
        for (i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static long sum2(int n, int m) {
        int i = 0;
        long sum = 0;
        while (i <= n) {
            if (i % m == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }
        return sum;
    }

    public static long sum3(int n, int m) {
        int i = 0;
        long sum = 0;
        do {
            if (i % m == 0)
            {
                sum = sum + i;
            }
            i = i + 1;
        }while(i<=n);
        return sum;
    }
}
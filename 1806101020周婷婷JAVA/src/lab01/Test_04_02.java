package lab01;

public class Test_04_02 {
    public static void main(String[] args) {
        int i, n = 100;
        long sum = 0;
        //while

        i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum[1:n]=" + sum);
    }
}

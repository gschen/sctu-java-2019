package lab01;

public class Test_04_03 {
    public static void main(String[] args) {
        int i, n = 100;
        long sum = 0;

//do while
        i=1;
        do {
            sum+=i;
            i ++;
        }
        while (i<=n);
        System.out.println("sum[1:n]="+sum);
    }
}

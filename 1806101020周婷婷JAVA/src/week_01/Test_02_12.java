package week_01;

public class Test_02_12 {
    public static void main(String[] args) {
        int i, n = 100;
        long sum = 0;
//for
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum[1:n]=" + sum);


    }
}
class Test_02_12_01 {
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
class Test_02_12_02 {
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

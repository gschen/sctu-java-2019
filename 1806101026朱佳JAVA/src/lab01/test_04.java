package lab01;

public class test_04 {
    public static void main(String []args) {
        int sum1 = 0;
        for(int i=1;i<101;i++){
            sum1 += i;
        }
        System.out.println(sum1);
//for

            int n = 100;
            int sum2 = 0;
            int i = 0;
            while (i <= n) {
                sum2+=i++;
            }
            System.out.println(sum2);
//while

        int m = 100;
        int sum3 = 0;
        int j = 0;
        do {
            sum3 += j++;
        }
        while (j <= m);
        System.out.println(sum3);

//do while

    }
}












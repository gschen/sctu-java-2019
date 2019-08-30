package lab_01;
//4、	分别用 for 语句、while 语句以及 do while 语句编写一个求和程序（即 sum=1+2+3+...+n）。
public class Test_04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        int sum1 = 1;
        int j = 1;
        while (j<=100 ){
            sum1+=j;
            j++;
        }
        System.out.println(sum1);

        int sum2 = 1;
        int n = 1;
        do {
            sum+=n;
            n++;
        }while (n<=100);

        System.out.println(sum);
    }
}

package lab_01;

public class Test_04 {
    public static void main(String[] args) {
        int n=100;
        System.out.println("for循环求和结果"+sum1(n));
        System.out.println("while循环求和结果"+sum1(n));
        System.out.println("do while循环求和结果"+sum1(n));

    }
    public static long sum1(int n) {
        int i=0;
        long sum=0;
        for (i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static long sum2(int n){
        int i=0;
        long sum=0;
        while (i<=n){
            sum=sum+i;
        }
        return sum;
    }
    public static long sum3(int n){
        int i=0;
        long sum=0;
        do {
            sum=sum+i;
            i=i+1;
        }while (i<=n);
        return sum;
    }

}
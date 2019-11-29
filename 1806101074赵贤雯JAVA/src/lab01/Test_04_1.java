package lab_01;

public class Test_04_1 {
    //使用for语句编写一个求和程序sum=1+2+3+4+……n
    public static void main(String[] args) {
        int i,n=100;
        long sum=0;
        for (i = 1; i <= n; i++) {
            sum += i;
        } System.out.println(sum);
    }
}



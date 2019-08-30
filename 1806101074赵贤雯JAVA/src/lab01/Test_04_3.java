package lab01;

public class Test_04_3 {
    //使用do while语句编写一个求和程序
    public static void main(String[] args) {
        int i,n=100;
        long sum=0;
        i=1;
        do {
            sum+=i;
            i+=1;
        }
        while (i<=n);
        System.out.println(sum);
    }
}

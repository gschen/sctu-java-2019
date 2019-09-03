package lab01;

public class test_04 {
    public static void main(String[] args) {
        int i , n;
        int sum =0;
        n=(int)(Math.random()*100);

        for (i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("for循环求和的结果"+n);


    }


}
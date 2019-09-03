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

        int j=1;
        while (j<=n){
            j++;
            sum=sum+j;
        }
        System.out.println("while循环求和的结果"+n);

        int t = 0;
        do{
            t++;
            sum=sum+t;

        }
        while (t==n);{
            System.out.println("do-while循环求和的结果"+n);
        }




    }


}
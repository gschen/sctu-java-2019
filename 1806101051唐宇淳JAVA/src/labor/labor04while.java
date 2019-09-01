package labor;

public class labor04while {
    public static long sum2(int n,int m){
        int i=0;
        long sum=0;
        while (i<=n){
            if (i%m==0){
                sum=sum+i;

            }
                i=i+1;

        }
                return sum;
    }

}

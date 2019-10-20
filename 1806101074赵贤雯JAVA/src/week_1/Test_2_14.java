package src.week_1;

public class Test_2_14 {
    public static void main(String args[]){
        int n,k,i,m=0;
        for(n=3;n<=1000;n=n+1){
            k=(int) Math.sqrt(n);
            for(i=2;i<=k;i++)
                if(n%i==0)break;
            if(i>=k+1){
                System.out.print(n+"  ");
                m=m+1;
            }
            if(m%5==0)
                System.out.println();
        }
    }
}


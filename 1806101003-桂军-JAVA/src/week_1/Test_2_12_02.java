package src.week_1;

public class Test_2_12_02 {
    public static void main(String[] args) {
        int sum,n,i;
        sum=0;n=100;i=1;
        do {sum=sum+i;
            i++;
        }while (i<=n);
        System.out.println("所求和为："+sum);
    }
}

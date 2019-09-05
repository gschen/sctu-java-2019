package Lab01;

public class Lab01_04_3 {
    public static void main(String[] args) {
        int sum,n,i;
        sum=0;n=100;i=1;
        do {sum=sum+i;
            i++;
        }while (i<=n);
        System.out.println("所求和为："+sum);
    }

}

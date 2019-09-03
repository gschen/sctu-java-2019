package labor;

public class labor04dowhile {

    public static void main(String[] args) {

        int count=0;

        int sum=0;

        do{
            sum+=count;
            count++;

        }while(count<=100);

        System.out.println("1~100的和为："+sum);

    }
}

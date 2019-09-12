package lab_01;

public class Test_04 {
    public static void main(String args[]){
        //for循环
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println(sum);

        int sum1 = 0;
        int j = 1;

        while (j<=100 ){
            sum1+=j;
            j++;
        }
        System.out.println(sum1);

        int sum2 = 0;
        int n = 1;
        do {
            sum2+=n;
            n++;
        }while (n<=100);

        System.out.println(sum2);
    }
}

package lab_01;

public class Test_04 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int sum=0;

        //for循环
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

        //while
        int i=1;
        sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);

        //do-while
        i=1;
        sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}



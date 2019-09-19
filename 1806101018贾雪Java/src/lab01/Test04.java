package lab01;

public class Test04 {
    public static void main(String[] args) {
        int i=0;
        int n = (int) (Math.random() * 100);
     long sum=0;
     long sum1=0;
     long sum2=0;
        //for语句
        for (i=0;i<=n;i++){

           sum=sum+i;
        }
        System.out.println("for语句的结果："+sum);
        //while 语句

        while (i<=n){
            i=i+1;
            sum1=sum1+i;
        }
        System.out.println("while语句的结果："+sum1);
        //do while 语句

        do {
            i=i+1;
            sum2=sum2+i;
        }
        while (i<=n);
        System.out.println("do while语句的结果："+sum2);
    }
}

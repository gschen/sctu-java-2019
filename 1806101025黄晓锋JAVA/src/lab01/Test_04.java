package lab_01;

public class Test_04 {
    public static void main(String[] args) {
        int a=0,b=0,sum1=0,sum2=0,sum3=0;
        for(int i=1;i<=100;i++){
            sum1=sum1+i;
        }

        while(a<=100){
            a=a+1;
            sum2=sum2+a;
            if(a>=100)break;
        }

        do {
            if(b<=100) {
                sum3 = sum3 + b;
            }
            b=b+1;
        }while (b<=100);
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("smu3="+sum3);
    }
}


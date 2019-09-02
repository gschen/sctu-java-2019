package lab_01;

public class Test_12 {
    public static void main(String[] args) {
        int x=0;
        for (int i=1;i<=1000;i++){
            int a=i/100;
            int b=(i-a*100)/10;
            int c=(i-b*10-a*100);
            if (i==a*a*a+b*b*b+c*c*c){
                x++;
                System.out.print(i+" ");
            }

        }
    }
}

package lab_01;

public class test_12 {
    public static void main(String[] arge) {
        int n,m,i,t,v;
        for (n = 1; n <= 1000; n++){
            i=n/100;         //求出百位数
            m=n%100/10;      //求出十位数
            t=n%100%10;      //求出个位数
            v=i*i*i+m*m*m+t*t*t;

            if(n==v){
                System.out.println(n);

            }
        }
    }

}

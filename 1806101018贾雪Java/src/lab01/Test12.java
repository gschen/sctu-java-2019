package lab_01;
import java.io.StringReader;
import java.util.Scanner;
public class Test12 {
    public static void main(String[] args) {
        for (int i = 1; i <1000 ; i++) {
            boolean flag=true;
            if (Narcissus(i)==flag){
                System.out.println(i+"是水仙花素");
            }

        }
    }
    public static boolean Narcissus(int x){
        boolean flag=false;
        int i,j,k=0;
        i=x/100;//百位
        j=(x%100)/10;//十位
        k=x%10;//个位
        if (x==i*i*i+j*j*j+k*k*k){
            return flag=true;//是水仙花素
        }
        else {
            return flag;
        }
    }

}

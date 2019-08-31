package lab_01;

import java.io.StringReader;
import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //System.out.print("请输入一个数字，判断是否为水仙花素：");
        //int x=input.nextInt();
        for (int i = 1; i <=1000 ; i++) {
            boolean flag=true;
            if (Narcissus(i)==flag){
                System.out.println(i+"是水仙花素");
            }
            /*
            else {
                System.out.println(i+"不是水仙花素");
            }
            */
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

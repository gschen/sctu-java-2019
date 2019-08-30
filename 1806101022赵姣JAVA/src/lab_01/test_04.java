package lab_01;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class test_04 {
    public static void main(String args[]){
        int i,n=100;
        long sum=0;
        //for语句
        for (i=1;i<=n;i++);
            sum+=i;
        System.out.println("sum[1:n]"+sum);}
        //while语句
        {
       int i,n=100;
        long sum=0;
        i=1;
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum[1:n]"+sum);}
        //do whlie 语句
        {
            int i,n=100;
            long sum=0;
            i=1;
       do {
           sum+=i;
           i++;
       }while(i<=n);
       System.out.println("sum[1:n]"+sum);}
        }


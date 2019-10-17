package lab_01;

import java.lang.reflect.Type;
public class test_11 {
    public static void main(String [] agre){
        int i,n,m,v ;
        System.out.println("请输入一个数");
        java.util.Scanner sc =new java.util.Scanner(System.in);
        i= sc.nextInt();
        if (i<=99){

            System.out.println("这是一个两位数");
        }
        else if(i <= 999){
            System.out.println("这是一个三位数");
        }
        else if(i <= 9999){
            System.out.println("这是一个四位数");
        }
    }

}

package lab_01;

import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

class Test_0402{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a:");
        int a=sc.nextInt();
        int sum=0;
        int b=1;
        do{
            sum+=a++;
        }while(b<=a);
        System.out.println(sum);
    }
}

class Test_0403{
    public static void main(String[] args) {

    }
}
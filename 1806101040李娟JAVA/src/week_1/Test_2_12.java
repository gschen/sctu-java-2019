package src.week_1;

import java.util.Scanner;

public class Test_2_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

class Test_2_1202{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入k:");
        int j=sc.nextInt();
        int k=1;
        int sum=0;
        while(k<=j){
            sum+=k++;
        }
        System.out.println(sum);
    }
}

class Test_2_1203{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入x:");
        int x=sc.nextInt();
        int sum=0;
        int y=1;
        do{
            sum+=y++;;
        }while(y<=x);
        System.out.println(sum);
    }
}



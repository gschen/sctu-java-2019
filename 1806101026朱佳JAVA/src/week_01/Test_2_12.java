package week_01;

import java.util.Scanner;

public class Test_2_12 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = mas.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        //for
    }
}

class Test_2_1201{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n){

            sum+= i++;
        }
        System.out.println(sum);
        //while
    }
}



class Test_2_1202{
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = mas.nextInt();
        int sum = 0;
        int i =0;
        do {
            sum+=i++;
        }
        while (i<=n);
        System.out.println(sum);//do while
    }
}

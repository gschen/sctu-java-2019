package lab_01;
import java.util.Random;
import java.util.Scanner;

public class Test_01 {
    /*public static void main(String args[]){
        System.out.println("hello,word!!!");
    }*/
    /*public static void main(String args[]){
        for (int i = 100;i<=300;i++){
            if (i % 3 !=0 ){
                System.out.println(i);
            }
        }
    }*/
    /*public static void main(String args[]){
        for (int i = 1;i<=100;i++){
            System.out.println(i);
            if (i==78){
                break;
            }
        }
    }*/
    /*public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scan_input.nextInt();
        int sum = 0;
        for (int i = 0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }*/
    /*public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scan_input.nextInt();
        int sum = 0;
        int i = 1;
        while (i<= n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }*/
    /*public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scan_input.nextInt();
        int sum = 0;
        int i = 1;
        do {
          sum = sum + i;
          i++;
        }while (i<=n);
        System.out.println(sum);
    }*/
    /*public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入分数：");
        int n = scan_input.nextInt();
        if (n>=85){
            System.out.println("A级");
        }
         else if (n>=70){
            System.out.println("B级");
        }
        else if (n>=60){
            System.out.println("C级");
        }
        else {
            System.out.println("D级");
        }
    }*/
    public static void main(String args[]){
        Random rand = new Random();
        int i = rand.nextInt();
        i = rand.nextInt(100);

        while (true) {
            Scanner scan_input = new Scanner(System.in);
            System.out.println("请输入一个1到100的整数：");
            int n = scan_input.nextInt();


            if (i < n) {
                System.out.println("猜大了");
            } else if (i > n) {
                System.out.println("猜小了");
            } else {

                System.out.println("正确");
            }
        }
    }
}

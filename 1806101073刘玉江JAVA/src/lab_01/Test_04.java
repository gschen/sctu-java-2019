package lab_01;
import java.util.Scanner;
public class Test_04 {
    public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = scan_input.nextInt();
        int sum = 0;
        for (int i = 0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
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
}

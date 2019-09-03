package week_01;
import java.util.Scanner;
public class Test_2_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {

            sum += i++;
        }
        System.out.println(sum);
    }
}

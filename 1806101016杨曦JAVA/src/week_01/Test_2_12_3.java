package week_01;
import java.util.Scanner;
public class Test_2_12_3 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = mas.nextInt();
        int sum = 0;
        int i = 0;
        do {
            sum += i++;
        }
        while (i <= n);
        System.out.println(sum);
    }
}
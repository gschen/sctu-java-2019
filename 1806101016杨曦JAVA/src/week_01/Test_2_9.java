package week_01;
import java.util.Scanner;
public class Test_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("不及格");
        } else if (n == 2) {
            System.out.println("及格");
        } else if (n == 3) {
            System.out.println("中等");
        } else if (n == 4) {
            System.out.println("良好");
        } else {
            System.out.println("优秀");


            System.out.println();
        }
    }
}
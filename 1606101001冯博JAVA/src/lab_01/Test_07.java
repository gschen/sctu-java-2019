package lab_01;
import java.util.Scanner;
public class Test_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个1~100之间的整数！");
        int j = (int) (Math.random() * 100 + 1);
        while (true) {
            int i = scan.nextInt();
            if (i > j) {
                System.out.println("猜大了");
                System.out.println("请继续输入！");
            } else if (i < j) {
                System.out.println("猜小了");
                System.out.println("请继续输入！");
            } else {
                System.out.println("猜对了！");
            }
        }
    }
}
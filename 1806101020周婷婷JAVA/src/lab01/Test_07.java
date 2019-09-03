package lab01;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        int i=(int)(Math.random()*100);

        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你的猜测(1-100)：");
            int n = sc.nextInt();
            if (n < i) {
                System.out.println("小了");
            }
            else if (n > i) {
                System.out.println("大了");
            }
            else {
                System.out.println("对了就是：" + i);
                break;

            }
        }
    }
}

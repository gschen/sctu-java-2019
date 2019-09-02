package labor;

import java.util.Random;
import java.util.Scanner;

public class labor07 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        for (;;) {
            System.out.println("请输入猜的——正整数——数字：");
            int guessNumber=scan.nextInt();
            if (guessNumber>number) {
                System.out.println("猜大了。");
                continue;
            } else if (guessNumber<number) {
                System.out.println("猜小了。");
                continue;
            } else {
                System.out.println("恭喜，猜对了。");
                break;
            }
        }
    }
}
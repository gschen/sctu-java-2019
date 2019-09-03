package week_01;
import java.util.Scanner;
public class Test_2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数值：");
        int x = input.nextInt();
        if (x == 1) {
            System.out.print("不及格");
        } else if (x == 2) {
            System.out.print("及格");
        } else if (x == 3) {
            System.out.print("中等");
        } else if (x == 4) {
            System.out.print("良好");
        } else if (x == 5) {
            System.out.print("优秀");
        } else {
            System.out.print("您输入的值的范围不在1-5之间（包含1和5），请重新运行程序");
        }
    }
}


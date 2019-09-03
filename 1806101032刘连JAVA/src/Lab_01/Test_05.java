package Lab_01;

        import java.util.Scanner;
public class Test_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入分数：");
        int x = input.nextInt();
        if (x == 1) {
            System.out.println("不及格");
        } else if (x == 2) {
            System.out.println("及格");
        } else if (x == 3) {
            System.out.println("中等");
        } else if (x == 4) {
            System.out.println("良好");
        } else if (x == 5) {
            System.out.println("优秀");
        } else {
            System.out.println("您输入的值的范围不在1-5之间（包含1和5），请重新运行程序");
        }
    }
}
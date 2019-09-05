import java.util.Scanner;

public class Test_2_9 {
    public static void main(String args[]) {
        Scanner scan_input =new Scanner(System.in);
        System.out.println("");
        int score = scan_input.nextInt();
        if (score == 1) {
            System.out.println("不及格");
        } else if (score == 2) {
            System.out.println("及格");
        } else if (score == 3) {
            System.out.println("中等");
        } else if (score == 4) {
            System.out.println("良好");
        } else {
            System.out.println("优秀");
        }
    }
}
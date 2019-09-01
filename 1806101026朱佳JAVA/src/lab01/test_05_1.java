package lab01;

import java.util.Scanner;

public class test_05_1 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个1-5的数:");
        int score = mas.nextInt();

        switch (score) {
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            default:
                System.out.println("优秀");
                break;

        }
    }
}
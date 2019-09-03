package labor;

import java.util.Scanner;

public class labor05if {
    public static void main(String[] args) {

        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade >4) {
            System.out.println("优秀");
        } else if (grade >= 4) {
            System.out.println("良好");
        } else if (grade >= 3) {
            System.out.println("中等");
        } else if (grade >= 2) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }


    }
}

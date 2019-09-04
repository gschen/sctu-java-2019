package lab01;
import java.util.Scanner;
public class Test_06 {
    public static void main(String[] args) {
        char grade;
        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入你的等级：");
        grade = (char) Sc.nextInt();
        if (grade == 'A') {
            System.out.println("你的成绩为85分以上");
        } else if (grade == 'B') {
            System.out.println("你的成绩为70-85分之间");
        } else if (grade == 'C') {
            System.out.println("你的成绩为60-70分之间");

        } else if (grade == 'D') {
            System.out.println("你的成绩为60分一下");
        }


    }
}

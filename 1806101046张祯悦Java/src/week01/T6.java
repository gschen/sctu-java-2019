package week01;
import java.util.Scanner;
public class T6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入学生成绩等级（要求大写）：");

        String b =input.nextLine();

        char a=b.charAt(0);

        if (a=='A')
        {
            System.out.println("学生的学习成绩范围为a>=85 && a<=100");
        } else if (a=='B') {
            System.out.println("学生的学习成绩范围为a>=70");
        } else if (a=='C') {
            System.out.println("学生的学习成绩范围为a>=60");
        } else if (a=='D') {
            System.out.println("学生的学习成绩范围为a>=0 && a<60");
        } else{
            System.out.println("输入错误");
        }

    }
}

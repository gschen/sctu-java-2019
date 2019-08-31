package lab_01;
import java.util.Scanner;
public class Test_06 {public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int grade=sc.nextInt();
        if (grade>=0 && grade<60)System.out.println("你的等级为D");
        else if (grade>=60 && grade<70)System.out.println("你的等级为C");
        else if (grade>=70 && grade<85)System.out.println("你的等级为B");
        else if (grade>=85 && grade<=100)System.out.println("你的等级为A");
        else System.out.println("成绩输入错误");
    }
}

package day20190829.Lab01;
import java.util.Scanner;
public class test05_2 {
    public static void main(String[] args) {
        System.out.println("成绩是：");
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        switch (grade){
            case "1":
                System.out.println("不及格");
            break;
            case "2":
                System.out.println("及格");
            break;
            case "3":
                System.out.println("中等");
                break;
            case "4":
                System.out.println("良好");
                break;
            case "5":
                System.out.println("优秀");
                break;
        }
    }
}

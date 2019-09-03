package lab01;
import java.util.Scanner;
public class text05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入等级：");
        String n = input.next();
        if (n.equals("A")) {
            System.out.println("您的成绩为85~100");
        }
        if (n.equals("B")) {
            System.out.println("您的成绩为70~75");
        }
        if (n.equals("C")){
            System.out.println("您的成绩为60~70");
        }
        if (n.equals("D")) {
            System.out.println("您的成绩为0~60");
        }
    }
}
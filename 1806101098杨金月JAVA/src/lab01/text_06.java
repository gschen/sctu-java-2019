package lab01;
import java.util.Scanner;
public class text_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的等级：");
        String x=input.next();
        switch (x) {
            case "A":
                System.out.println("你的成绩在85分以上包含85分");
                break;
            case "B":
                System.out.println("你的成绩在70分到85分（包含70分，不包含85分）");
                break;
            case "C":
                System.out.println("你的成绩在60分到70分（包含60分，不包含70分）");
                break;
            case "D":
                System.out.println("你的成绩在60分以下（不包含60分）");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}


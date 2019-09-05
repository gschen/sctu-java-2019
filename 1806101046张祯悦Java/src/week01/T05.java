package week01;
import java.util.Scanner;
public class T05 {
    public static void main(String[] args) {
        System.out.println("请输入该学生的成绩：(请输入1-5)");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if( score == 1){
            System.out.println("不及格");
        }else if (score == 2){
            System.out.println("及格");
        }else if(score == 3){
            System.out.println("中等");
        }else if(score == 4){
            System.out.println("良好");
        }else if(score == 5){
            System.out.println("优秀");
        }
        System.out.println("请输入该学生的成绩：(请输入1-5)");
        Scanner m = new Scanner(System.in);
        int scores = m.nextInt();
        switch(scores){
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
            case 5:
                System.out.println("优秀");
                break;
            default:
                System.out.println("请输入正确的成绩");
        }
    }
}


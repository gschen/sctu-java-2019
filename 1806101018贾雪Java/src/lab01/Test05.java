package lab_01;
 import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        int score;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        score=sc.nextInt();

        if (score == 1){
            System.out.println("不及格");
        }
        else if (score==2){
            System.out.println("及格");
        }
        else if (score==3){
            System.out.println("中等");
        }
        else if (score==4){
            System.out.println("良好");
        }
        else if (score==5){
            System.out.println("优秀");
        }
    }
}

package lab01;
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        int score;
       Scanner Sc=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        score=Sc.nextInt();
       if (score>=85){
           System.out.println("你的等级为：A");
       }
       else if (70<=score&score<80){
           System.out.println("你的等级为：B");
       }
       else if (60<=score&score<70){
           System.out.println("你的等级为：C");

       }
       else if (score<60){
           System.out.println("你的等级为：D");
       }


    }

}

package src.week_1;

import java.util.Scanner;

public class Test_2_9 {
    public static void main(String args[]){
        Scanner scan_input=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int x = scan_input.nextInt();
        if(x==1){
            System.out.print("不及格");

            }
        if(x==2){
            System.out.print("及格");

        }
        if(x==3){
            System.out.print("中等");

        }
        if(x==4){
            System.out.print("良好");

        }
        if(x==5){
            System.out.print("优秀");

        }

    }
}

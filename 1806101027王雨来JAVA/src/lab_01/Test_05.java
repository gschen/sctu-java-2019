package lab_01;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        float score=sc.nextInt();
        if (score==5) {
            System.out.println("优秀");
        } else if (score==4) {
            System.out.println("良好");
        } else if (score==3) {
            System.out.println("中等");
        } else if (score==2) {
            System.out.println("及格");
        } else if (score==1) {
            System.out.println("不及格");
        }else
            System.out.println("请不要乱输");
    }
}

class Test_051{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩等级（1-5）：");
        int n = sc.nextInt();
        switch (n){
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
                System.out.println("请不要乱输！！！");
                break;
        }
    }
}




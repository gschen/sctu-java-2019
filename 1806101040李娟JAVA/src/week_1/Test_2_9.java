package week_1;

import java.util.Scanner;

public class Test_2_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩(1-5):");
        int n=sc.nextInt();
        String str="";
        switch(n){
            case 1:
                str="不及格";
                break;
            case 2:
                str="及格";
                break;
            case 3:
                str="中等";
                break;
            case 4:
                str="良好";
                break;
            case 5:
                str="优秀";
                break;
        }
        System.out.println(str);
    }
}

class Test_2_901{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩(1-5):");
        int i=sc.nextInt();
        if(i==1){
            System.out.println("不及格");
        }
        else if(i==2){
            System.out.println("及格");
        }
        else if(i==3){
            System.out.println("合格");
        }
        else if(i==4){
            System.out.println("良好");
        }
        else if(i==5){
            System.out.println("优秀");
        }
        System.out.println();
    }
}

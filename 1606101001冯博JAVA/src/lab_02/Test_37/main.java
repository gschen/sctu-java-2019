package lab_02.Test_37;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] grade=new int[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的学历：" + "\n" + "1、本科生，2、研究生");
        int a=scanner.nextInt();
        System.out.println("请输入你三门科目的成绩");
        for (int i = 0; i <3 ; i++) {
            grade[i]=scanner.nextInt();
        }
        if (a==1){
            Undergraduate undergraduate=new Undergraduate(grade);
            undergraduate.avg();
        }
        else if (a==2){
                Graduate graduate=new Graduate(grade);
            graduate.avg();
        }
    }
}

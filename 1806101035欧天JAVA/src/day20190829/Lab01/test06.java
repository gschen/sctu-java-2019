package day20190829.Lab01;

import java.util.Scanner;

public class test06 {
    public static void main(String [] args){
        System.out.println("等级：");
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        if(grade. equals("A"))
            System.out. println("范围在[85,100]");
        else if(grade.equals("B"))
            System.out.println("范围在[70,85)");
        else if(grade. equals("C") )
            System.out.println("范围在60,70)");
        else if(grade.equals("D"))
            System.out.println("范围在[0,60)");
        else
            System.out.println("输入有误！");
    }
}


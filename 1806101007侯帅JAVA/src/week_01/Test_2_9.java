package week_01;

import java.util.Scanner;

public class Test_2_9 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("请输入你的成绩等级（1--4）：");
    int n=sc.nextInt();
    if(n==1)
        System.out.println("成绩>=85");
    if(n==2)
        System.out.println("成绩>=70");
    if(n==3)
        System.out.println("成绩>=60");
    if (n==4)
        System.out.println("成绩<=60");
    else
        System.out.println("你输入的这个数字的超纲了，我无法识别！");


}}

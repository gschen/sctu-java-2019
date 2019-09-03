package lab_01;
//6、	编程输入学生的学习成绩的等级，给出相应的成绩范围。设A级为85分以上（包括85）；
// B级为70分以上（包括70分）；C级为60分以上（包括60分）；D级为60分以下。

import java.util.Scanner;
public class Test_06 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("请输入你的成绩：");
     int n=sc.nextInt();
    String str="";
    if(n>=0&&n<=59){
        str="D级";
    }
    else if(n>=60&&n<=69){
        str="C级";
    }
    else if(n>=70&&n<=84){
        str="B级";
    }
    else if(n>=85){
        str="A级";
    }
    System.out.println("成绩等级为"+str);
    }
}

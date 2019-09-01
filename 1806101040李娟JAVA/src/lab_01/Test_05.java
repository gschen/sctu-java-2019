package lab_01;
//5、	请分别用 if-else 语句和 switch 语句编写能够实现以下功能的程序。
//某同学某门课的成绩可能的结果为1，2，3，4，和5。当成绩为1时请输出不及格；
// 成绩为2时请输出及格；成绩为3时请输出中等；成绩为4时请输出良好；成绩为5时请输出优秀。

import java.util.Scanner;

//使用switch语句
public class Test_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int i = sc.nextInt();
        String str="";
        switch(i){
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
        }
        System.out.println(str);
    }
}

//使用if_else语句
 class Test_051{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("不及格");
        }
        else if(n==2){
            System.out.println("及格");
        }
        else if(n==3){
            System.out.println("中等");
        }
        else if(n==4){
            System.out.println("良好");
        }
        else{
            System.out.println("优秀");
        }
    }
}